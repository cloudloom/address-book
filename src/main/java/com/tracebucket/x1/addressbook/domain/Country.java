package com.tracebucket.x1.addressbook.domain;

import javax.persistence.*;

/**
 * Created by ffl on 02-01-2015.
 */
@Entity
@Table(name = "COUNTRY")
public class Country extends BaseEntity {

    @Column(name = "NAME", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}