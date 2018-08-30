package org.oscm.app.dto;

import org.oscm.app.domain.ProvisioningStatus;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InstanceDTO {

    private long id;

    @NotEmpty
    private String organizationId;

    private String organizationName;

    @NotEmpty
    private String subscriptionId;

    private String referenceId;

    private ProvisioningStatus provisioningStatus;

    private String provisioningMsg;

    private LocalDateTime requestTime;

    private String instanceId;

    @NotEmpty
    private String controllerId;

    private List<InstanceParameterDTO> parameters = new ArrayList<>();

    private List<InstanceAttributeDTO> attributes = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public ProvisioningStatus getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(ProvisioningStatus provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public String getProvisioningMsg() {
        return provisioningMsg;
    }

    public void setProvisioningMsg(String provisioningMsg) {
        this.provisioningMsg = provisioningMsg;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getControllerId() {
        return controllerId;
    }

    public void setControllerId(String controllerId) {
        this.controllerId = controllerId;
    }

    public List<InstanceParameterDTO> getParameters() {
        return parameters;
    }

    public void setParameters(List<InstanceParameterDTO> parameters) {
        this.parameters = parameters;
    }

    public List<InstanceAttributeDTO> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<InstanceAttributeDTO> attributes) {
        this.attributes = attributes;
    }
}
