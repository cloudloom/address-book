package com.tracebucket.x1.addressbook.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ffl on 02-01-2015.
 */
@Entity
@Table(name = "COUNTRY")
public class Country extends ValueObject {

    @Column(name = "NAME", nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String name;

    @Column(name = "ABBREVIATION_2")
    @Basic(fetch = FetchType.EAGER)
    private String abbreviation_2;

    @Column(name = "ABBREVIATION_3")
    @Basic(fetch = FetchType.EAGER)
    private String abbreviation_3;

    @Column(name = "IDD")
    @Basic(fetch = FetchType.EAGER)
    private String idd;

    @Column(name = "FLAG")
    @Basic(fetch = FetchType.EAGER)
    private String flag;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "COUNTRY__ID")
    private Set<County> counties = new HashSet<County>(0);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation_2() {
        return abbreviation_2;
    }

    public void setAbbreviation_2(String abbreviation_2) {
        this.abbreviation_2 = abbreviation_2;
    }

    public String getAbbreviation_3() {
        return abbreviation_3;
    }

    public void setAbbreviation_3(String abbreviation_3) {
        this.abbreviation_3 = abbreviation_3;
    }

    public String getIdd() {
        return idd;
    }

    public void setIdd(String idd) {
        this.idd = idd;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public Set<County> getCounties() {
        return counties;
    }

    public void setCounties(Set<County> counties) {
        this.counties = counties;
    }
}