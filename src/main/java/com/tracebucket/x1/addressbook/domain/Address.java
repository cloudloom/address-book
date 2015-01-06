package com.tracebucket.x1.addressbook.domain;

import javax.persistence.*;

/**
 * Created by ffl on 02-01-2015.
 */
@Embeddable
public class Address {

    @Column(name = "BUILDING_NUMBER")
    @Basic(fetch = FetchType.EAGER)
    private String buildingNumber;

    @Column(name = "BUILDING_NAME")
    @Basic(fetch = FetchType.EAGER)
    private String buildingName;

    @Column(name = "STREET")
    @Basic(fetch = FetchType.EAGER)
    private String street;

    @Column(name = "AREA")
    @Basic(fetch = FetchType.EAGER)
    private String area;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CITY__ID")
    private City city;

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
