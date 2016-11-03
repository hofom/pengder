package com.slark.pengder.net.handler;

import com.slark.SlarkContext;
import com.slark.pengder.net.Appliance;
import com.slark.pengder.net.PengderChannelGroup;
import com.slark.pengder.net.ResponeConfiredList;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;
import com.slark.pengder.service.AbsSimpleService;
import com.slark.pengder.service.receiver.AbsReceiverService;
import io.netty.channel.*;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * Created by fengwei on 16/7/7. com.google.protobuf.GeneratedMessageLite
 */
public class ProtoBufferMessageHandler extends
		SimpleChannelInboundHandler<PengderMessage> {
	private static final Logger logger = Logger
			.getLogger(ProtoBufferMessageHandler.class);
	/**
	 * 连续正常收到多个心跳包认为网络状态好，可触发同步-心跳包个数上限（默认10，类型int）
	 * pengder.commServer.heartbeat.update = 6
	 */
	private int maxHeartBeatNumForUpdate = 6;
	/**
	 * 连续正常收到多个心跳包将刷卡机状态置为“在线”（默认5，类型int） pengder.commServer.heartbeat.online =
	 * 5
	 */
	private int maxHeartBeatNumForOnline = 5;

	/**
	 * Calls {@link ChannelHandlerContext#fireExceptionCaught(Throwable)} to
	 * forward to the next {@link ChannelHandler} in the {@link ChannelPipeline}
	 * .
	 * <p/>
	 * Sub-classes may override this method to change behavior.
	 *
	 * @param ctx
	 * @param cause
	 */
	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
			throws Exception {
		// cause.printStackTrace();
		logger.error("网络异常出现....引起异常的原因为:" + cause.getMessage());
		logger.error(cause.getMessage(), cause);
		ctx.close();
	}

	protected AbsReceiverService getService(String svcName) {
		return (AbsReceiverService) SlarkContext.getBean(svcName);
	}

	/**
	 * Is called for each message of type .
	 *
	 *
	 * @param ctx
	 *            the {@link ChannelHandlerContext} which this
	 *            {@link SimpleChannelInboundHandler} belongs to
	 * @param msg
	 *            the message to handle
	 * @throws Exception
	 *             is thrown if an error occurred
	 */
	@Override
	protected void messageReceived(ChannelHandlerContext ctx, PengderMessage msg)
			throws Exception {

		Appliance app = msg.getAppliance();
		MessageProtos.MessageType messageType = MessageProtos.MessageType
				.valueOf(msg.getMsgId());

		if (app == null) {
			logger.error("当前设备的心跳包未注册，设备地址： "
					+ ctx.channel().remoteAddress().toString() + ",消息: "
					+ msg.toString());
			return;
		}

		logger.debug("收到消息id为 ： " + msg.getMsgId() + "消息,协议版本号: "
				+ msg.getVersion() + ",设备id: " + app.getApplianceID());
		/**
		 * 如果没有绑定 则如何处理了？ 这种情况下应该忽略掉这个心跳包 因为设备还没有进行绑定
		 */
		try {
			if (messageType == MessageProtos.MessageType.HEARTBEAT) {
				MessageProtos.Heartbeat hb = (MessageProtos.Heartbeat) msg
						.getMsg();
				// logger.debug("收到心跳消息，消息为 : " + msg.toString());
				app.addHeartbeatCount();
				logger.debug("收到心跳消息，已收到心跳包个数:" + app.getHeartbeatCount());
				AbsReceiverService svc = getService("heartbeatService");
				/**
				 * 调用服务
				 */
				List<PengderMessage> respList = svc.doService(msg);
				if (respList == null) {
					logger.error("心跳服务处理异常，即将关闭当前的设备通道");
					ctx.close();
					return;
				}

				if (respList.isEmpty()) {
					logger.error("心跳包处理异常,当前的心跳消息为:" + msg);
					return;
				}
				//PengderMessage resp = respList.get(0);
				// resp.setAppliance(app);
				//app.send(resp);
				for(PengderMessage resp : respList){
					app.send(resp);
				}
				return;
			} else if (messageType == MessageProtos.MessageType.COMMAND) {
				// logger.debug("收到通用应答消息:" + msg);
				AbsReceiverService svc = getService("commandService");
				List<PengderMessage> respList = null;

				// 得到当前待回复消息
				PengderMessage rqst = app.getCurrMsg();// confiredList.poll();
				if (rqst != null) {
					msg.setRqstMsg(rqst);
				}
				// 通用应答消息无返回
				respList = svc.doService(msg);
				if (respList != null) {
					logger.debug("需要发送的消息包个数为: " + respList.size());
					for (PengderMessage message : respList) {
						// msg.setAppliance(app);
						app.send(message);
					}
				}
				return;
			} else if (messageType == MessageProtos.MessageType.INSTRUMENTBINDING) {
				// logger.debug("收到仪器的绑定请求，仪器的信息是:" + msg);
				AbsReceiverService svc = getService("bindingTinstrument");
				List<PengderMessage> respList = svc.doService(msg);
				if (respList == null) {
					logger.error("查询初始化列表数据失败!");
					return;
				}
				if (respList.isEmpty()) {
					logger.warn("当前设备没有需要初始化的列表");
				}
				/**
				 * 将数据连续的发送出去
				 */
				for (PengderMessage message : respList) {
					app.send(message);
				}
				return;
			} else if (messageType == MessageProtos.MessageType.SYSTEMEVENTLIST) {
				/**
				 * 系统事件
				 */
				// logger.debug("收到仪器的系统事件数据" + msg);
				AbsReceiverService svc = getService("sysEventService");
				List<PengderMessage> respList = svc.doService(msg);
				if (respList == null) {
					logger.error("系统事件处理失败!");
					return;
				}
				if (respList.isEmpty()) {
					logger.warn("系统事件处理失败");
				}
				// 会产生一个command_ok的应答
				for (PengderMessage message : respList) {
					app.send(message);
				}
			} else if (messageType == MessageProtos.MessageType.SESSIONLIST) {
				/**
				 * 这个返回的null,因为服务内部已经写出了数据
				 */
				// logger.debug("收到仪器的使用记录数据" + msg);
				AbsReceiverService svc = getService("sessionService");
				svc.doService(msg);
			} else if (messageType == MessageProtos.MessageType.USERINTRAININGLIST) {
				// logger.debug("收到用户培训数据同步请求...");
				AbsReceiverService svc = getService("trainService");
				List<PengderMessage> respList = svc.doService(msg);
				if (respList == null) {
					logger.error("同步用户培训数据失败。。。。");
					return;
				}
				/* 开始发送数据 */
				for (PengderMessage message : respList) {
					app.send(message);
				}
			} else if (messageType == MessageProtos.MessageType.USEREVENTLIST) {
				// logger.debug("收到用户事件处理列表" + msg);
				AbsReceiverService svc = getService("userEventService");

				List<PengderMessage> respList = svc.doService(msg);
				if (respList == null) {
					logger.warn("出事用户事件列表失败。");
					return;
				}
				/* 写出消息 */
				for (PengderMessage message : respList) {
					app.send(message);
				}
			} else if (messageType == MessageProtos.MessageType.FTPEVENTLIST) {
				/* ftp文件上传文件记录信息入库 */
				// logger.debug("收到ftp文件列表数据 : " + msg);

				AbsReceiverService svc = getService("ftpFileInfomation");
				if (svc != null) {
					/* 进行服务调用 */
					List<PengderMessage> respList = svc.doService(msg);
					logger.debug("ftp服务执行完毕....");

					for (PengderMessage message : respList) {
						app.send(message);
					}
				} else {
					logger.error("创建ftpFileInfomation服务失败...");
				}
			} else if (messageType == MessageProtos.MessageType.SESSION_OPERATION_REP_CMD){

				AbsSimpleService  svc = SlarkContext.obtainBean("userDeplaneService");
				svc.doService(msg);
				logger.debug("用户下机操作设备端返回结果服务执行完毕");

				return;
			}else {
				logger.error("未定义的消息报，Message : " + msg.toString());
				return;
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return;
		}

	}

	/**
	 * Calls {@link ChannelHandlerContext#fireChannelReadComplete()} to forward
	 * to the next {@link ChannelHandler} in the {@link ChannelPipeline}.
	 * <p/>
	 * Sub-classes may override this method to change behavior.
	 *
	 * @param ctx
	 */
	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		logger.debug("设备请求处理完毕,设备：" + ctx.channel());
		ctx.flush();
	}

	/**
	 * Calls {@link ChannelHandlerContext#disconnect(ChannelPromise)} to forward
	 * to the next {@link ChannelHandler} in the {@link ChannelPipeline}.
	 * <p/>
	 * Sub-classes may override this method to change behavior.
	 *
	 * @param ctx
	 * @param promise
	 */
	@Override
	public void disconnect(ChannelHandlerContext ctx, ChannelPromise promise)
			throws Exception {
		Appliance app = PengderChannelGroup.defaultTerminalGroup()
				.getAppliance(ctx.channel());
		if (app == null) {
			logger.warn("出现未注册的仪器网络通道，该通道的连接触发了disconnect事件 : channel : "
					+ ctx.channel().toString());
		} else {
			logger.warn("仪器{" + app.toString() + "}触发了disconnect事件");
		}
		super.disconnect(ctx, promise);
	}

	/**
	 * Calls {@link ChannelHandlerContext#close(ChannelPromise)} to forward to
	 * the next {@link ChannelHandler} in the {@link ChannelPipeline}.
	 * <p/>
	 * Sub-classes may override this method to change behavior.
	 *
	 * @param ctx
	 * @param promise
	 */
	@Override
	public void close(ChannelHandlerContext ctx, ChannelPromise promise)
			throws Exception {
		Appliance app = PengderChannelGroup.defaultTerminalGroup()
				.getAppliance(ctx.channel());
		if (app == null) {
			logger.warn("出现未注册的仪器网络通道，该通道的连接触发了close事件 : channel : "
					+ ctx.channel().toString());
		} else {
			logger.warn("仪器{" + app.toString() + "}触发了close事件");
		}
		super.close(ctx, promise);
	}
}
