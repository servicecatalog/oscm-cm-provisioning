package org.oscm.app.domain;

import javax.persistence.*;

@MappedSuperclass
public abstract class InstanceKeyValueHolder {

    @Id
    @GeneratedValue
    private long tKey;

    private String key;

    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    private Instance instance;

    public long gettKey() {
        return tKey;
    }

    public void settKey(long tKey) {
        this.tKey = tKey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Instance getInstance() {
        return instance;
    }

    public void setInstance(Instance instance) {
        this.instance = instance;
    }
}
