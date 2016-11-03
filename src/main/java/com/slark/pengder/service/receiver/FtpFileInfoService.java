package com.slark.pengder.service.receiver;

import com.slark.pengder.comm.UtilCheck;
import com.slark.pengder.mybatis.dao.TExperimentFileMapper;
import com.slark.pengder.mybatis.model.TExperimentFile;
import com.slark.pengder.mybatis.model.TExperimentFileExample;
import com.slark.pengder.protocol.MessageProtos;
import com.slark.pengder.protocol.PengderMessage;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by fengwei on 16/8/22.
 */
@Service("ftpFileInfomation")
public class FtpFileInfoService extends AbsReceiverService {
    private static final Logger logger = Logger.getLogger(FtpFileInfoService.class);

    @Autowired
    private TExperimentFileMapper experimentFileMapper;

    /**
     * @descrption 先查询文件是否存在
     * @param inFile
     * @return
     */
    private TExperimentFile selectFtpFileInfo(TExperimentFile  inFile){
        TExperimentFile  result = null;
        TExperimentFileExample  fexap = new TExperimentFileExample();

        fexap.createCriteria().andUseridEqualTo(inFile.getUserid())
                .andInstrumentidEqualTo(inFile.getInstrumentid())
                .andFileabsolutepathEqualTo(inFile.getFileabsolutepath())
                .andFilenameEqualTo(inFile.getFilename());

        List<TExperimentFile> res = experimentFileMapper.selectByExample(fexap);
        if(res == null || res.isEmpty()){
            return inFile;
        }else {
            result = res.get(0);
        }

        inFile.setId(result.getId());
        return inFile;
    }
    /**
     * @param ftpev
     * @return
     * @description 向数据插入ftp上传数据记录
     */
    public boolean insertFtpFileRecord(MessageProtos.FtpEvent ftpev) {
        TExperimentFile file = new TExperimentFile();

        int count = ftpev.getFileCount();
        logger.debug("ftp upload event ->gourpID : "
                + ftpev.getGroupId() + ",instrumentId :"
                + ftpev.getInstrumentId() + ",userId : "
                + ftpev.getUserId());
        file.setActivedaccount(ftpev.getActivedAccount());
        file.setGroupid(ftpev.getGroupId());
        file.setInstrumentid(ftpev.getInstrumentId());
        file.setUserid(ftpev.getUserId());

        for (int i = 0; i < count; i++) {
            MessageProtos.FtpFileUpload ffu = ftpev.getFile(i);
            String  fileName = null;
            String  filePath = null;
            /**
             * 如果上传文件失败。则跳过这个文件
             */
            if(ffu.getStatus() == MessageProtos.FTP_FILE_UPLOAD_STATUS.FTP_FILE_UPLOAD_FAIL){
                logger.warn("上传文件: " + ffu.getFileName() + "失败..");
                continue;
            }

            if(!ffu.getFileNameBytes().isValidUtf8()){
                logger.warn("文件名称不是有效的utf-8格式字符串");

                try {
                    //ffu.getFileNameBytes().toByteArray();
                    //CharBuffer cb = Charset.forName("GBK").decode(ffu.getFileNameBytes().asReadOnlyByteBuffer());
                    String fn = ffu.getFileNameBytes().toString("GBK");
                    logger.debug("尝试使用gbk转码仪器传入的文件名称，结果为: " + fn );
                    //fileName = new String(fn.getBytes("ISO-8859-1"),"utf-8");
                    //Charset.defaultCharset();
                    logger.debug("将文件名称转换成utf-8格式后的字符串为:" + fileName);
                } catch (UnsupportedEncodingException e) {
                   logger.warn(e.getMessage(),e);
                }

            }

            if(!ffu.getPathBytes().isValidUtf8()){
                logger.warn("文件路径名称不是有效的utf-8格式字符串");
                try {
                    String fn = ffu.getPathBytes().toString("GBK");
                    logger.debug("尝试使用gbk转码仪器传入的文件名称,结果为: " + fn );
                    //filePath = new String(fn.getBytes(),"utf-8");
                    //logger.debug("将文件名称转换成utf-8格式后的字符串为:" + fileName);
                } catch (UnsupportedEncodingException e) {
                    logger.warn(e.getMessage(),e);
                    //filePath = ffu.getPath();//ffu.getPathBytes().toStringUtf8();
                }
            }

            fileName = ffu.getFileName();//ffu.getFileNameBytes().toStringUtf8();
            filePath = ffu.getPath();//ffu.getPathBytes().toStringUtf8();

            logger.debug("上传的文件名称为: " + fileName);
            file.setFilename(fileName);
            file.setFileabsolutepath(filePath+ "/" + fileName);

            file.setAddtime(new Date());


            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date  createTime = null;
            try {
                if(ffu.getCreateTime() != null) {
                    createTime = sdf.parse(ffu.getCreateTime());
                }else {
                    createTime = new Date();
                }
            } catch (ParseException e) {
                //e.printStackTrace();
                logger.error(e.getMessage(),e);
                logger.error("设备端传入的时间格式异常(" +ffu.getCreateTime()+ ")，" +
                        "时间格式必须为：yyyy-MM-dd HH:mm:ss," +
                        "将使用当前系统时间作为文件的创建时间");
                createTime = new Date();
            }

            file.setFilecreatetime(createTime);
            file.setFilesize(Long.valueOf(ffu.getFileSize()));
            file.setProgress(ffu.getPercentage());
            //ffu.getConsumeTime();
            /*首先按照相关信息查询数据*/
            file = this.selectFtpFileInfo(file);
            /**
             * 采用replace来处理这条记录
             */
            experimentFileMapper.replaceSelective(file);
        }

        return false;
    }

    /**
     * @param msg
     * @return
     * @Description 重新定义这个接口
     */
    @Transactional
    public List<PengderMessage> doService(PengderMessage msg) {

        logger.debug("收到文件上传消息....");

        if (msg.getMsg() instanceof MessageProtos.FtpEventList) {
            MessageProtos.FtpEventList ftpFiles = (MessageProtos.FtpEventList) msg.getMsg();
            //ftpFiles.getFtpEvent()
            int count = ftpFiles.getFtpEventCount();
            for (int i = 0; i < count; i++) {
                MessageProtos.FtpEvent ftpFile = ftpFiles.getFtpEvent(i);
                insertFtpFileRecord(ftpFile);
            }
        } else {
            logger.error("请求的消息类型异常(+" + msg.getMsg().getClass().getName()
                    + ")，消息类型必须为：" + MessageProtos.FtpEventList.class.getName());
            return null;
        }

        PengderMessage resp = UtilCheck.newCommandMessage(MessageProtos.Command.Option.SERVER_RECV_OK.getNumber());
        List<PengderMessage> res = this.newResponeMsgList();
        res.add(resp);
        return res;
    }


}
