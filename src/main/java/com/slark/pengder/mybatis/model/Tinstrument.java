package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class Tinstrument {
    private Integer id;

    private String name;

    private String model;

    private String specification;

    private String manufacturer;

    private String country;

    private String supplier;

    private Date purchaseddate;

    private BigDecimal value;

    private String imageid;

    private Integer transactor;

    private String room;

    private String doorlist;

    private String assetnumber;

    private Long assetmanager;

    private String application;

    private String accessories;

    private String parameter;

    private Long organizationid;

    private Integer instrumenttypeid;

    private Short bookingmodelid;

    private String terminalmac;

    private String terminalversion;

    private Short controltypeid;

    private Short instrumentstatusid;

    private Date beginusingtime;

    private Short mininterval;

    private Short maxinterval;

    private Short minleadtime;

    private Integer maxleadtime;

    private Byte maxvalidbooking;

    private Short bookingholdingtime;

    private Short freecancelling;

    private Short alerttime;

    private Short offdelaytime;

    private Short minofftime;

    private Float alertcurrent;

    private Integer createdid;

    private Date createddate;

    private Integer modifiedid;

    private Date modifieddate;

    private Integer deletedid;

    private Date deleteddate;

    private Integer applysyntick;

    private Integer receivesyntick;

    private Short nocarduse;

    private Short minorderdate;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public Date getPurchaseddate() {
        return purchaseddate;
    }

    public void setPurchaseddate(Date purchaseddate) {
        this.purchaseddate = purchaseddate;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid == null ? null : imageid.trim();
    }

    public Integer getTransactor() {
        return transactor;
    }

    public void setTransactor(Integer transactor) {
        this.transactor = transactor;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room == null ? null : room.trim();
    }

    public String getDoorlist() {
        return doorlist;
    }

    public void setDoorlist(String doorlist) {
        this.doorlist = doorlist == null ? null : doorlist.trim();
    }

    public String getAssetnumber() {
        return assetnumber;
    }

    public void setAssetnumber(String assetnumber) {
        this.assetnumber = assetnumber == null ? null : assetnumber.trim();
    }

    public Long getAssetmanager() {
        return assetmanager;
    }

    public void setAssetmanager(Long assetmanager) {
        this.assetmanager = assetmanager;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application == null ? null : application.trim();
    }

    public String getAccessories() {
        return accessories;
    }

    public void setAccessories(String accessories) {
        this.accessories = accessories == null ? null : accessories.trim();
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    public Long getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(Long organizationid) {
        this.organizationid = organizationid;
    }

    public Integer getInstrumenttypeid() {
        return instrumenttypeid;
    }

    public void setInstrumenttypeid(Integer instrumenttypeid) {
        this.instrumenttypeid = instrumenttypeid;
    }

    public Short getBookingmodelid() {
        return bookingmodelid;
    }

    public void setBookingmodelid(Short bookingmodelid) {
        this.bookingmodelid = bookingmodelid;
    }

    public String getTerminalmac() {
        return terminalmac;
    }

    public void setTerminalmac(String terminalmac) {
        this.terminalmac = terminalmac == null ? null : terminalmac.trim();
    }

    public String getTerminalversion() {
        return terminalversion;
    }

    public void setTerminalversion(String terminalversion) {
        this.terminalversion = terminalversion == null ? null : terminalversion.trim();
    }

    public Short getControltypeid() {
        return controltypeid;
    }

    public void setControltypeid(Short controltypeid) {
        this.controltypeid = controltypeid;
    }

    public Short getInstrumentstatusid() {
        return instrumentstatusid;
    }

    public void setInstrumentstatusid(Short instrumentstatusid) {
        this.instrumentstatusid = instrumentstatusid;
    }

    public Date getBeginusingtime() {
        return beginusingtime;
    }

    public void setBeginusingtime(Date beginusingtime) {
        this.beginusingtime = beginusingtime;
    }

    public Short getMininterval() {
        return mininterval;
    }

    public void setMininterval(Short mininterval) {
        this.mininterval = mininterval;
    }

    public Short getMaxinterval() {
        return maxinterval;
    }

    public void setMaxinterval(Short maxinterval) {
        this.maxinterval = maxinterval;
    }

    public Short getMinleadtime() {
        return minleadtime;
    }

    public void setMinleadtime(Short minleadtime) {
        this.minleadtime = minleadtime;
    }

    public Integer getMaxleadtime() {
        return maxleadtime;
    }

    public void setMaxleadtime(Integer maxleadtime) {
        this.maxleadtime = maxleadtime;
    }

    public Byte getMaxvalidbooking() {
        return maxvalidbooking;
    }

    public void setMaxvalidbooking(Byte maxvalidbooking) {
        this.maxvalidbooking = maxvalidbooking;
    }

    public Short getBookingholdingtime() {
        return bookingholdingtime;
    }

    public void setBookingholdingtime(Short bookingholdingtime) {
        this.bookingholdingtime = bookingholdingtime;
    }

    public Short getFreecancelling() {
        return freecancelling;
    }

    public void setFreecancelling(Short freecancelling) {
        this.freecancelling = freecancelling;
    }

    public Short getAlerttime() {
        return alerttime;
    }

    public void setAlerttime(Short alerttime) {
        this.alerttime = alerttime;
    }

    public Short getOffdelaytime() {
        return offdelaytime;
    }

    public void setOffdelaytime(Short offdelaytime) {
        this.offdelaytime = offdelaytime;
    }

    public Short getMinofftime() {
        return minofftime;
    }

    public void setMinofftime(Short minofftime) {
        this.minofftime = minofftime;
    }

    public Float getAlertcurrent() {
        return alertcurrent;
    }

    public void setAlertcurrent(Float alertcurrent) {
        this.alertcurrent = alertcurrent;
    }

    public Integer getCreatedid() {
        return createdid;
    }

    public void setCreatedid(Integer createdid) {
        this.createdid = createdid;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Integer getModifiedid() {
        return modifiedid;
    }

    public void setModifiedid(Integer modifiedid) {
        this.modifiedid = modifiedid;
    }

    public Date getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }

    public Integer getDeletedid() {
        return deletedid;
    }

    public void setDeletedid(Integer deletedid) {
        this.deletedid = deletedid;
    }

    public Date getDeleteddate() {
        return deleteddate;
    }

    public void setDeleteddate(Date deleteddate) {
        this.deleteddate = deleteddate;
    }

    public Integer getApplysyntick() {
        return applysyntick;
    }

    public void setApplysyntick(Integer applysyntick) {
        this.applysyntick = applysyntick;
    }

    public Integer getReceivesyntick() {
        return receivesyntick;
    }

    public void setReceivesyntick(Integer receivesyntick) {
        this.receivesyntick = receivesyntick;
    }

    public Short getNocarduse() {
        return nocarduse;
    }

    public void setNocarduse(Short nocarduse) {
        this.nocarduse = nocarduse;
    }

    public Short getMinorderdate() {
        return minorderdate;
    }

    public void setMinorderdate(Short minorderdate) {
        this.minorderdate = minorderdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}