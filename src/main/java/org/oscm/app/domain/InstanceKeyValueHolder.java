package org.oscm.app.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class InstanceKeyValueHolder {

    @Id
    @GeneratedValue
    private long id;

    private String key;

    private String value;

    @ManyToOne(optional = false)
    private Instance serviceInstance;
}
