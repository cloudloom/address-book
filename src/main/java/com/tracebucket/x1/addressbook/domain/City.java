package com.tracebucket.x1.addressbook.domain;

import javax.persistence.*;

/**
 * Created by ffl on 02-01-2015.
 */
@Entity
@Table(name = "CITY")
public class City extends ValueObject {

    @Column(name = "NAME", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String name;

    @Column(name = "IMAGE")
    @Basic(fetch = FetchType.EAGER)
    private String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}