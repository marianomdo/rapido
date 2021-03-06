/*Copyright (c) 2019-2020 voyy.com All Rights Reserved.
 This software is the confidential and proprietary information of voyy.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with voyy.com*/
package com.rapido.deodongskokvdk.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class RapidoAccountResponse implements Serializable {


    @ColumnAlias("accountsource")
    private String accountsource;

    @ColumnAlias("name")
    private String name;

    @ColumnAlias("isdeleted")
    private Boolean isdeleted;

    @ColumnAlias("systemmodstamp")
    private Timestamp systemmodstamp;

    @ColumnAlias("createddate")
    private Timestamp createddate;

    @ColumnAlias("accountnumber")
    private String accountnumber;

    @ColumnAlias("annualrevenue")
    private BigDecimal annualrevenue;

    @ColumnAlias("active__c")
    private String activeC;

    @ColumnAlias("sfid")
    private String sfid;

    @ColumnAlias("id")
    private Integer id;

    @ColumnAlias("_hc_lastop")
    private String hcLastop;

    @ColumnAlias("_hc_err")
    private String hcErr;

    @ColumnAlias("account_ext_id__c")
    private String accountExtIdC;

    @ColumnAlias("billingcity")
    private String billingcity;

    @ColumnAlias("type")
    private String type;

    @ColumnAlias("billinglatitude")
    private BigDecimal billinglatitude;

    @ColumnAlias("phone")
    private String phone;

    @ColumnAlias("billingpostalcode")
    private String billingpostalcode;

    @ColumnAlias("billinglongitude")
    private BigDecimal billinglongitude;

    @ColumnAlias("billingstate")
    private String billingstate;

    @ColumnAlias("website")
    private String website;

    @ColumnAlias("billingstreet")
    private String billingstreet;

    @ColumnAlias("photo_url__c")
    private String photoUrlC;

    public String getAccountsource() {
        return this.accountsource;
    }

    public void setAccountsource(String accountsource) {
        this.accountsource = accountsource;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsdeleted() {
        return this.isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Timestamp getSystemmodstamp() {
        return this.systemmodstamp;
    }

    public void setSystemmodstamp(Timestamp systemmodstamp) {
        this.systemmodstamp = systemmodstamp;
    }

    public Timestamp getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Timestamp createddate) {
        this.createddate = createddate;
    }

    public String getAccountnumber() {
        return this.accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public BigDecimal getAnnualrevenue() {
        return this.annualrevenue;
    }

    public void setAnnualrevenue(BigDecimal annualrevenue) {
        this.annualrevenue = annualrevenue;
    }

    public String getActiveC() {
        return this.activeC;
    }

    public void setActiveC(String activeC) {
        this.activeC = activeC;
    }

    public String getSfid() {
        return this.sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHcLastop() {
        return this.hcLastop;
    }

    public void setHcLastop(String hcLastop) {
        this.hcLastop = hcLastop;
    }

    public String getHcErr() {
        return this.hcErr;
    }

    public void setHcErr(String hcErr) {
        this.hcErr = hcErr;
    }

    public String getAccountExtIdC() {
        return this.accountExtIdC;
    }

    public void setAccountExtIdC(String accountExtIdC) {
        this.accountExtIdC = accountExtIdC;
    }

    public String getBillingcity() {
        return this.billingcity;
    }

    public void setBillingcity(String billingcity) {
        this.billingcity = billingcity;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getBillinglatitude() {
        return this.billinglatitude;
    }

    public void setBillinglatitude(BigDecimal billinglatitude) {
        this.billinglatitude = billinglatitude;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBillingpostalcode() {
        return this.billingpostalcode;
    }

    public void setBillingpostalcode(String billingpostalcode) {
        this.billingpostalcode = billingpostalcode;
    }

    public BigDecimal getBillinglongitude() {
        return this.billinglongitude;
    }

    public void setBillinglongitude(BigDecimal billinglongitude) {
        this.billinglongitude = billinglongitude;
    }

    public String getBillingstate() {
        return this.billingstate;
    }

    public void setBillingstate(String billingstate) {
        this.billingstate = billingstate;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getBillingstreet() {
        return this.billingstreet;
    }

    public void setBillingstreet(String billingstreet) {
        this.billingstreet = billingstreet;
    }

    public String getPhotoUrlC() {
        return this.photoUrlC;
    }

    public void setPhotoUrlC(String photoUrlC) {
        this.photoUrlC = photoUrlC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RapidoAccountResponse)) return false;
        final RapidoAccountResponse rapidoAccountResponse = (RapidoAccountResponse) o;
        return Objects.equals(getAccountsource(), rapidoAccountResponse.getAccountsource()) &&
                Objects.equals(getName(), rapidoAccountResponse.getName()) &&
                Objects.equals(getIsdeleted(), rapidoAccountResponse.getIsdeleted()) &&
                Objects.equals(getSystemmodstamp(), rapidoAccountResponse.getSystemmodstamp()) &&
                Objects.equals(getCreateddate(), rapidoAccountResponse.getCreateddate()) &&
                Objects.equals(getAccountnumber(), rapidoAccountResponse.getAccountnumber()) &&
                Objects.equals(getAnnualrevenue(), rapidoAccountResponse.getAnnualrevenue()) &&
                Objects.equals(getActiveC(), rapidoAccountResponse.getActiveC()) &&
                Objects.equals(getSfid(), rapidoAccountResponse.getSfid()) &&
                Objects.equals(getId(), rapidoAccountResponse.getId()) &&
                Objects.equals(getHcLastop(), rapidoAccountResponse.getHcLastop()) &&
                Objects.equals(getHcErr(), rapidoAccountResponse.getHcErr()) &&
                Objects.equals(getAccountExtIdC(), rapidoAccountResponse.getAccountExtIdC()) &&
                Objects.equals(getBillingcity(), rapidoAccountResponse.getBillingcity()) &&
                Objects.equals(getType(), rapidoAccountResponse.getType()) &&
                Objects.equals(getBillinglatitude(), rapidoAccountResponse.getBillinglatitude()) &&
                Objects.equals(getPhone(), rapidoAccountResponse.getPhone()) &&
                Objects.equals(getBillingpostalcode(), rapidoAccountResponse.getBillingpostalcode()) &&
                Objects.equals(getBillinglongitude(), rapidoAccountResponse.getBillinglongitude()) &&
                Objects.equals(getBillingstate(), rapidoAccountResponse.getBillingstate()) &&
                Objects.equals(getWebsite(), rapidoAccountResponse.getWebsite()) &&
                Objects.equals(getBillingstreet(), rapidoAccountResponse.getBillingstreet()) &&
                Objects.equals(getPhotoUrlC(), rapidoAccountResponse.getPhotoUrlC());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountsource(),
                getName(),
                getIsdeleted(),
                getSystemmodstamp(),
                getCreateddate(),
                getAccountnumber(),
                getAnnualrevenue(),
                getActiveC(),
                getSfid(),
                getId(),
                getHcLastop(),
                getHcErr(),
                getAccountExtIdC(),
                getBillingcity(),
                getType(),
                getBillinglatitude(),
                getPhone(),
                getBillingpostalcode(),
                getBillinglongitude(),
                getBillingstate(),
                getWebsite(),
                getBillingstreet(),
                getPhotoUrlC());
    }
}