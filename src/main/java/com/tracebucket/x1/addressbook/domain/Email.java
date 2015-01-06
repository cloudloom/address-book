package com.tracebucket.x1.addressbook.domain;

import com.tracebucket.x1.addressbook.dictionary.EmailType;

import javax.persistence.*;

/**
 * Created by ffl on 02-01-2015.
 */
@Embeddable
public class Email {

    @Column(name = "EMAIL")
    @Basic(fetch = FetchType.EAGER)
    private String email;

    @Column(name = "EMAIL_TYPE", nullable = false, columnDefinition = "ENUM('PERSONAL', 'BUSINESS') default 'BUSINESS'")
    @Enumerated(EnumType.STRING)
    private EmailType emailType;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmailType getEmailType() {
        return emailType;
    }

    public void setEmailType(EmailType emailType) {
        this.emailType = emailType;
    }

}

