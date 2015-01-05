package com.tracebucket.x1.addressbook.domain;

import javax.persistence.Entity;

/**
 * Created by ffl on 02-01-2015.
 */
@Entity
public class Phone{

    private String mobileNumber;
    private String landLineNumber;
    private String countryPrefix;
    private String areaCode;
    private String landLineNumberExt;


    public Phone() {
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLandLineNumber() {
        return landLineNumber;
    }

    public void setLandLineNumber(String landNumber) {
        this.landLineNumber = landNumber;
    }

    public String getCountryPrefix() {
        return countryPrefix;
    }

    public void setCountryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getLandLineNumberExt() {
        return landLineNumberExt;
    }

    public void setLandLineNumberExt(String landNumberExt) {
        this.landLineNumberExt = landNumberExt;
    }
}
