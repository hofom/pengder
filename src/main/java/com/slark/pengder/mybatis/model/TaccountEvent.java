package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class TaccountEvent {
    private Integer id;

    private BigDecimal money;

    private BigDecimal initcredit;

    private Integer event;

    private Integer newevent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

	public BigDecimal getMoney() {
		return money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public BigDecimal getInitcredit() {
		return initcredit;
	}

	public void setInitcredit(BigDecimal initcredit) {
		this.initcredit = initcredit;
	}

	public Integer getEvent() {
		return event;
	}

	public void setEvent(Integer event) {
		this.event = event;
	}

	public Integer getNewevent() {
		return newevent;
	}

	public void setNewevent(Integer newevent) {
		this.newevent = newevent;
	}

    
}