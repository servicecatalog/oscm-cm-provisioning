package org.oscm.app.dto;

public class InstanceAttributeDTO {

    private long tKey;

    private String key;

    private String value;

    public long getTKey() {
        return tKey;
    }

    public void setTKey(long tKey) {
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

    @Override
    public String toString() {
        return "InstanceAttributeDTO{" +
                "tKey=" + tKey +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
