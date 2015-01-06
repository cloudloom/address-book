package com.tracebucket.x1.addressbook.domain;

import com.tracebucket.x1.addressbook.dictionary.Status;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Objects;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseAggregateRoot implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, columnDefinition = "BIGINT UNSIGNED")
    protected Long id;

    @Column(name = "VERSION")
	@Version
	private Integer version;

    @Column(name = "STATUS", nullable = false, columnDefinition = "ENUM('ACTIVE','INACTIVE') default 'ACTIVE'")
    @Enumerated(EnumType.STRING)
    @Basic(fetch = FetchType.EAGER)
    private Status status;

    @Column(name = "UID", unique = true, nullable = false)
    @Basic(fetch = FetchType.EAGER)
    private String uid;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		@SuppressWarnings("unchecked")
        BaseAggregateRoot that = (BaseAggregateRoot) obj;

		return Objects.equals(this.id, that.id);
	}

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

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @PrePersist
    public void init() {
        this.uid = UUID.randomUUID().toString();
        this.status = Status.ACTIVE;
    }
}
