package org.oscm.app.service.intf;

import org.oscm.app.domain.ControllerSetting;
import org.oscm.app.dto.ControllerDTO;
import org.oscm.app.dto.ControllerOrganizationDTO;
import org.oscm.app.dto.ControllerSettingDTO;

import java.util.List;

public interface ControllerOrganizationService {

    public List<ControllerDTO> getAvailableControllers();

    public ControllerOrganizationDTO createControllerOrganization(ControllerOrganizationDTO organization);

    public List<ControllerOrganizationDTO> getAllControllerOrganizations();

    public List<ControllerOrganizationDTO> getControllerOrganizations(String controllerId);

    public List<ControllerDTO> getOrganizationControllers(String orgId);

    public List<ControllerSettingDTO> getControllerSettings(String controllerId, String orgId);
}
