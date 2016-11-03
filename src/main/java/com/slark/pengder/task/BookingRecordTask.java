package com.slark.pengder.task;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.slark.pengder.mybatis.dao.ProcMapper;
import com.slark.pengder.mybatis.dao.TbookingrecordMapper;

/**
 * 检查数据库预约列表，处理预约状态
 * 后台定时任务
 * @author HeHao
 *
 */
@Component(value="bookingTask")
public class BookingRecordTask {
	private static final Logger logger = Logger.getLogger(BookingRecordTask.class);
	
	@Autowired
	ProcMapper procMapper;
	
	/**
	 * 检查过期预约，调用存储过程处理
	 */
	public void bookingOver(){
		try{
			logger.debug("更新预约状态-针对未审批过期预约");
			procMapper.updateRecordTo1104();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	@Autowired
	TbookingrecordMapper tbookingrecordMapper;
	
	/**
	 * 检查无刷卡机仪器预约,每天更新一次，将到期的预约标记为已完成
	 * 需要事务控制，只有一条语句
	 * @throws Exception 
	 */
	@Transactional
	public void bookingNoCard() throws Exception{
		try {
			logger.debug("更新预约状态-针对无刷卡机仪器的已完成预约");
			tbookingrecordMapper.updateWithDev();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
