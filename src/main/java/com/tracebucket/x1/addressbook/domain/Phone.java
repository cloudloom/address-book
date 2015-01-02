package com.tracebucket.x1.addressbook.domain;

import javax.persistence.Entity;

/**
 * Created by ffl on 02-01-2015.
 */
@Entity
public class Phone extends BaseEntity {

    private String phoneNumber;
    private String lastName;
    private String middleName;
    private String firstName;

    public Phone() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
