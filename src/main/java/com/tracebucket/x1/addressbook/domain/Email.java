package com.tracebucket.x1.addressbook.domain;

import javax.persistence.Entity;

/**
 * Created by ffl on 02-01-2015.
 */
@Entity
public class Email{

    private String userID;

    public Email() {
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

}
