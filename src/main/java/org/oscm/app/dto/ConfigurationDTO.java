package org.oscm.app.dto;

import org.oscm.app.domain.enumeration.Controller;
import org.oscm.app.validation.ControllerId;

import javax.validation.constraints.NotEmpty;

public class ConfigurationDTO {

    private long id;

    @NotEmpty
    @ControllerId
    private String controllerId;

    @NotEmpty
    private String organizationId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getControllerId() {
        return controllerId;
    }

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}
