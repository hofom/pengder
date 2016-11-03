package com.slark.pengder.ws;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slark.pengder.mybatis.dao.TbookingrecordMapper;
import com.slark.pengder.mybatis.dao.TcalendarMapper;
import com.slark.pengder.mybatis.model.Tbookingrecord;
import com.slark.pengder.mybatis.model.Tcalendar;

@Service("testAop")
public class TestAop extends BaseService {
	private static final Logger logger = Logger.getLogger(TestAop.class);
	@Autowired TbookingrecordMapper mappper;
	
	@Override
	@Transactional
	public void doService() {
		// TODO Auto-generated method stub
		Tbookingrecord booking = new Tbookingrecord();
		booking.setId(Long.valueOf(31622L));
		booking.setInstrumentid(2);
		booking.setUserid(3);
		mappper.insertSelective(booking);
		logger.debug(booking);
		//int i = 1/0;
	}
	
}
