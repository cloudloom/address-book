package com.tracebucket.x1.addressbook.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sadath on 05-Jan-15.
 */
@MappedSuperclass
public abstract class ValueObject implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false, columnDefinition = "BIGINT UNSIGNED")
    protected Long id;

    @Column(name = "VERSION")
    @Version
    private Long version;

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
}
