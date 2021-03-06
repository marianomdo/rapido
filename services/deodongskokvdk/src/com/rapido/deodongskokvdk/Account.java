/*Copyright (c) 2019-2020 voyy.com All Rights Reserved.
 This software is the confidential and proprietary information of voyy.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with voyy.com*/
package com.rapido.deodongskokvdk;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Account generated by WaveMaker Studio.
 */
@Entity
@Table(name = "`account`")
public class Account implements Serializable {

    private Integer id;
    private String accountsource;
    private String name;
    private Boolean isdeleted;
    private LocalDateTime systemmodstamp;
    private LocalDateTime createddate;
    private String accountnumber;
    private BigDecimal annualrevenue;
    private String activeC;
    private String sfid;
    private String hcLastop;
    private String hcErr;
    private String accountExtIdC;
    private String billingcity;
    private String type;
    private BigDecimal billinglatitude;
    private String phone;
    private String billingpostalcode;
    private BigDecimal billinglongitude;
    private String billingstate;
    private String website;
    private String billingstreet;
    private String photoUrlC;

    @Id
    @SequenceGenerator(name = "generator", sequenceName = "`account_id_seq`" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator")
    @Column(name = "`id`", nullable = false, scale = 0, precision = 10)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "`accountsource`", nullable = true, length = 40)
    public String getAccountsource() {
        return this.accountsource;
    }

    public void setAccountsource(String accountsource) {
        this.accountsource = accountsource;
    }

    @Column(name = "`name`", nullable = true, length = 255)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "`isdeleted`", nullable = true)
    public Boolean getIsdeleted() {
        return this.isdeleted;
    }

    public void setIsdeleted(Boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    @Column(name = "`systemmodstamp`", nullable = true)
    public LocalDateTime getSystemmodstamp() {
        return this.systemmodstamp;
    }

    public void setSystemmodstamp(LocalDateTime systemmodstamp) {
        this.systemmodstamp = systemmodstamp;
    }

    @Column(name = "`createddate`", nullable = true)
    public LocalDateTime getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(LocalDateTime createddate) {
        this.createddate = createddate;
    }

    @Column(name = "`accountnumber`", nullable = true, length = 40)
    public String getAccountnumber() {
        return this.accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    @Column(name = "`annualrevenue`", nullable = true, scale = 17, precision = 17)
    public BigDecimal getAnnualrevenue() {
        return this.annualrevenue;
    }

    public void setAnnualrevenue(BigDecimal annualrevenue) {
        this.annualrevenue = annualrevenue;
    }

    @Column(name = "`active__c`", nullable = true, length = 255)
    public String getActiveC() {
        return this.activeC;
    }

    public void setActiveC(String activeC) {
        this.activeC = activeC;
    }

    @Column(name = "`sfid`", nullable = true, length = 18)
    public String getSfid() {
        return this.sfid;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid;
    }

    @Column(name = "`_hc_lastop`", nullable = true, length = 32)
    public String getHcLastop() {
        return this.hcLastop;
    }

    public void setHcLastop(String hcLastop) {
        this.hcLastop = hcLastop;
    }

    @Column(name = "`_hc_err`", nullable = true, length = 2147483647)
    public String getHcErr() {
        return this.hcErr;
    }

    public void setHcErr(String hcErr) {
        this.hcErr = hcErr;
    }

    @Column(name = "`account_ext_id__c`", nullable = true, length = 50)
    public String getAccountExtIdC() {
        return this.accountExtIdC;
    }

    public void setAccountExtIdC(String accountExtIdC) {
        this.accountExtIdC = accountExtIdC;
    }

    @Column(name = "`billingcity`", nullable = true, length = 40)
    public String getBillingcity() {
        return this.billingcity;
    }

    public void setBillingcity(String billingcity) {
        this.billingcity = billingcity;
    }

    @Column(name = "`type`", nullable = true, length = 40)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "`billinglatitude`", nullable = true, scale = 17, precision = 17)
    public BigDecimal getBillinglatitude() {
        return this.billinglatitude;
    }

    public void setBillinglatitude(BigDecimal billinglatitude) {
        this.billinglatitude = billinglatitude;
    }

    @Column(name = "`phone`", nullable = true, length = 40)
    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "`billingpostalcode`", nullable = true, length = 20)
    public String getBillingpostalcode() {
        return this.billingpostalcode;
    }

    public void setBillingpostalcode(String billingpostalcode) {
        this.billingpostalcode = billingpostalcode;
    }

    @Column(name = "`billinglongitude`", nullable = true, scale = 17, precision = 17)
    public BigDecimal getBillinglongitude() {
        return this.billinglongitude;
    }

    public void setBillinglongitude(BigDecimal billinglongitude) {
        this.billinglongitude = billinglongitude;
    }

    @Column(name = "`billingstate`", nullable = true, length = 80)
    public String getBillingstate() {
        return this.billingstate;
    }

    public void setBillingstate(String billingstate) {
        this.billingstate = billingstate;
    }

    @Column(name = "`website`", nullable = true, length = 255)
    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Column(name = "`billingstreet`", nullable = true, length = 255)
    public String getBillingstreet() {
        return this.billingstreet;
    }

    public void setBillingstreet(String billingstreet) {
        this.billingstreet = billingstreet;
    }

    @Column(name = "`photo_url__c`", nullable = true, length = 255)
    public String getPhotoUrlC() {
        return this.photoUrlC;
    }

    public void setPhotoUrlC(String photoUrlC) {
        this.photoUrlC = photoUrlC;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        final Account account = (Account) o;
        return Objects.equals(getId(), account.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}