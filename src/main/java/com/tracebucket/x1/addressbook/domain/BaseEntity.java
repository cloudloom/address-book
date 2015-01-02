package com.tracebucket.x1.addressbook.domain;

import com.tracebucket.x1.addressbook.dictionary.Status;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

/**
 * User: ffl
 * Date: 8/11/13
 * Time: 3:32 PM
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, columnDefinition = "BIGINT UNSIGNED")
    protected Long id;

    @Column(name = "VERSION")
    @Version
    private Long version;

    @Column(name = "STATUS", nullable = false, columnDefinition = "ENUM('ACTIVE','INACTIVE') default 'ACTIVE'")
    @Enumerated(EnumType.STRING)
    @Basic(fetch = FetchType.EAGER)
    private Status status;

    @Column(name = "UID", unique = true, nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @PrePersist
    public void init() {
        this.uid = UUID.randomUUID().toString();
        this.status = Status.ACTIVE;
    }

    public Boolean isActive(){
        if(status == Status.ACTIVE)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (this.getUid() != null ? this.getUid().hashCode() : UUID.randomUUID().toString().hashCode());

        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;
        if (object == null)
            return false;
        if (getClass() != object.getClass())
            return false;

        BaseEntity other = (BaseEntity) object;
        if (this.getUid() != other.getUid() && (this.getUid() == null || !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", version=" + version +
                ", status=" + status +
                ", uid='" + uid + '\'' +
                "} " + super.toString();
    }
}
