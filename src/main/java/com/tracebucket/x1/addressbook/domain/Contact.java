package com.tracebucket.x1.addressbook.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ffl on 02-01-2015.
 */
@Entity
@Table(name = "CONTACT")
public class Contact extends BaseAggregateRoot {

    @Column(name = "CONTACT_REFERENCE")
    @Basic(fetch = FetchType.EAGER)
    private String contactReference;

    @Column(name = "CONTACT_TYPE", nullable = false, columnDefinition = "ENUM('ORGANIZATION', 'INDIVIDUAL', 'GROUP') default 'ORGANIZATION'")
    @Enumerated(EnumType.STRING)
    private ContactType contactType;

    @ElementCollection
    @JoinTable(name = "CONTACT_ADDRESS", joinColumns = @JoinColumn(name = "CONTACT__ID"))
    private Set<Address> addresses = new HashSet<Address>(0);

    @ElementCollection
    @JoinTable(name = "CONTACT_PHONE", joinColumns = @JoinColumn(name = "CONTACT__ID"))
    private Set<Phone> phones = new HashSet<Phone>(0);

    @ElementCollection
    @JoinTable(name = "CONTACT_EMAIL", joinColumns = @JoinColumn(name = "CONTACT__ID"))
    private Set<Email> emails = new HashSet<Email>(0);

    public String getContactReference() {
        return contactReference;
    }

    public void setContactReference(String contactReference) {
        this.contactReference = contactReference;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    public Set<Email> getEmails() {
        return emails;
    }

    public void setEmails(Set<Email> emails) {
        this.emails = emails;
    }
}
