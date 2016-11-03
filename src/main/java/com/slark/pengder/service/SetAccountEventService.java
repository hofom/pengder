package com.slark.pengder.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slark.pengder.mybatis.dao.TeventofaccountMapper;
import com.slark.pengder.mybatis.model.Taccount;
import com.slark.pengder.mybatis.model.Teventofaccount;

@Service("setAccountEvent")
public class SetAccountEventService extends AbsSimpleService {

	@Override
	@Transactional
	public List doService(Object param) {
		// TODO Auto-generated method stub
		if (param instanceof Taccount){
			Taccount obj = (Taccount)param;
			Short e = 1511; 
			if(obj.getMoney() == null){
				//来自大客户检查，只传入了id，event为1514
				e = 1514;
			}else if(obj.getMoney().add(obj.getInitcredit()).longValue() < 0){
				e = 1513;
			}else if(obj.getMoney().longValue() < 0){
				e = 1512;
			}else{
				e = 1511;
			}
			setAccountEvent(obj, e);
		}
		return null;
	}
	
	@Autowired
	TeventofaccountMapper teventofaccountMapper;
	
	private void setAccountEvent(Taccount account , Short e){
		Teventofaccount event = new Teventofaccount();
		event.setAccountid(account.getId());
		event.setEvent(e);
		event.setPartitionid((byte)(Calendar.getInstance().get(Calendar.YEAR) - 2000));
		teventofaccountMapper.insertWithAccount(event);
	}

}
