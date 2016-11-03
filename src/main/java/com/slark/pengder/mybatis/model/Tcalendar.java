package com.slark.pengder.mybatis.model;

import java.util.Date;

public class Tcalendar {
    private Date calendar;

    private Boolean isholiday;

    public Date getCalendar() {
        return calendar;
    }

    public void setCalendar(Date calendar) {
        this.calendar = calendar;
    }

    public Boolean getIsholiday() {
        return isholiday;
    }

    public void setIsholiday(Boolean isholiday) {
        this.isholiday = isholiday;
    }
}