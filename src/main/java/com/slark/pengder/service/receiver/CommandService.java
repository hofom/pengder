package com.slark.pengder.service.receiver;

import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.tools.QuerySyncDataOpr;
import com.slark.pengder.tools.UpdateDataTick;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengwei on 16/7/15.
 */
@Service("commandService")
public class CommandService extends AbsReceiverService {
	private static final Logger logger = Logger.getLogger(CommandService.class);
	/**
	 * @param msg
	 * @return
	 * @Description 重新定义这个接口
	 */
	@Autowired
	private QuerySyncDataOpr syncDataOpr;

	@Autowired
	private UpdateDataTick updateDataTick;

	private boolean isReplyInitOK(PengderMessage rqst) {
		if (rqst == null) {
			return false;
		}
		if (rqst.getMsgId() == MessageProtos.MessageType.COMMAND.getNumber()) {
			MessageProtos.Command rqstCommand = (MessageProtos.Command) rqst
					.getMsg();
			if (rqstCommand.getOption() == MessageProtos.Command.Option.SERVER_INIT_DONE) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @decription 命令服务接口
	 * @param msg
	 * @return
	 */
	public List<PengderMessage> doService(PengderMessage msg) {

		MessageProtos.Command cmd = (MessageProtos.Command) msg.getMsg();

		try {
			switch (cmd.getOption()) {
			case CLIENT_INIT_REQ: {
				return syncDataOpr.selectInstrumentList();
			}
			case CLIENT_RECV_OK: {
				PengderMessage rqst = msg.getRqstMsg();
				if (rqst == null) {
					logger.error("命令处理异常。当前命令包不存在对应的请求包");
					// return null;
				} else {
					logger.debug("收到命令消息:[" + rqst.getMsgId() + "]的响应");
					if (isReplyInitOK(rqst)) {
						logger.info("IO节点初始化列表发送完成，仪器ID："
								+ msg.getAppliance().getApplianceID());
						msg.getAppliance().setSyncInitData(true);
					} else {
						updateDataTick.setUpdateSuccess(rqst);
					}
				}
				break;

			}
			case CLIENT_RECV_ERR: {
				/**
				 * 原代码中不包含这部分逻辑 增加返回失败且含请求包，则重发
				 */
				PengderMessage rqst = msg.getRqstMsg();
				if (rqst != null) {
					logger.info("数据发送失败，重发，仪器ID："
							+ msg.getAppliance().getApplianceID());
					updateDataTick.setUpdateFailed(rqst);
					List<PengderMessage> l = new ArrayList<PengderMessage>();
					l.add(rqst);
					return l;
				}
			
			}
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}

		PengderMessage pmsg = msg.getRqstMsg();
		if (pmsg != null) {
			msg.getAppliance().setCurrMsg(null);
		}
		msg.getAppliance().send();

		return null;
	}
}
