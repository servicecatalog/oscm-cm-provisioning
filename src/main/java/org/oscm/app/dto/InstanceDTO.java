package org.oscm.app.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.oscm.app.domain.enumeration.ProvisioningStatus;
import org.oscm.app.validation.ControllerId;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ApiModel(value = "Instance", description = "Instance to be provisioned by the system")
public class InstanceDTO {

    @ApiModelProperty(position = 1, notes="Identifier of existing instance", readOnly = true)
    private long id;

    @ApiModelProperty(position = 2, notes="Identifier of existing organization", required = true)
    @NotEmpty
    private String organizationId;

    @ApiModelProperty(position = 3, notes="Name of existing organization")
    private String organizationName;

    @ApiModelProperty(position = 4, notes="Identifier of related subscription", required = true)
    @NotEmpty
    private String subscriptionId;

    @ApiModelProperty(position = 5, notes="Unique identifier of related subscription", required = true)
    private String referenceId;

    @ApiModelProperty(position = 6, notes="Status of instance provisioning process", readOnly = true)
    private ProvisioningStatus provisioningStatus;

    @ApiModelProperty(position = 7, notes="Latest message related to instance provisioning process", readOnly = true)
    private String provisioningMsg;

    @ApiModelProperty(position = 8, notes="Timestamp of the instance creation", readOnly = true)
    private LocalDateTime requestTime;

    @ApiModelProperty(position = 9, notes="Unique, automatically generated instance's identifier", readOnly = true)
    private String instanceId;

    @ControllerId
    @ApiModelProperty(position = 10, notes = "Id of the APP controller",
            allowableValues = "ess.aws, ess.openstack, ess.azure, ess.vmware", required = true)
    @NotEmpty
    private String controllerId;

    @ApiModelProperty(position = 11)
    private List<InstanceParameterDTO> parameters = new ArrayList<>();

    @ApiModelProperty(position = 12)
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
