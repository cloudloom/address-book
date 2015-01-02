package com.tracebucket.x1.addressbook.domain;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ffl on 02-01-2015.
 */
@Entity
public class Contact extends BaseEntity{

    private String contactReference;
    private ContactType contactType;

    private Set<Address> addresses = new HashSet<Address>(0);
    private Set<Phone> phones = new HashSet<Phone>(0);
    private Set<Email> emails = new HashSet<Email>(0);

}
