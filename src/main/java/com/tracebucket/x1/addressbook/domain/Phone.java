package com.tracebucket.x1.addressbook.domain;

import com.tracebucket.x1.addressbook.dictionary.PhoneType;

import javax.persistence.*;

/**
 * Created by ffl on 02-01-2015.
 */
@Embeddable
public class Phone {

    @Column(name = "NUMBER")
    @Basic(fetch = FetchType.EAGER)
    private Long number;

    @Column(name = "EXTENSION")
    @Basic(fetch = FetchType.EAGER)
    private Integer extension;

    @Column(name = "PHONE_TYPE", nullable = false, columnDefinition = "ENUM('MOBILE', 'WORK', 'HOME') default 'WORK'")
    @Enumerated(EnumType.STRING)
    private PhoneType phoneType;

    public Phone() {
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public Integer getExtension() {
        return extension;
    }

    public void setExtension(Integer extension) {
        this.extension = extension;
    }

    public PhoneType getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }
}
