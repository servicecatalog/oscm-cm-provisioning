package org.oscm.app.service.intf;

import org.oscm.app.dto.ControllerDTO;
import org.oscm.app.dto.ControllerOrganizationDTO;

import java.util.List;

public interface ControllerService {

    public List<ControllerDTO> getAvailableControllers();

    public ControllerOrganizationDTO createControllerOrganization(ControllerOrganizationDTO organization);

    public List<ControllerOrganizationDTO> getAllControllerOrganizations();

    public List<ControllerOrganizationDTO> getControllerOrganizations(String controllerId);
}
