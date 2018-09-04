package org.oscm.app.service.intf;

import org.oscm.app.dto.ControllerDTO;
import org.oscm.app.dto.ConfigurationDTO;
import org.oscm.app.dto.ConfigurationSettingDTO;

import java.util.List;
import java.util.Optional;

public interface ConfigurationService {

    List<ControllerDTO> getAvailableControllers();

    List<ConfigurationDTO> getAllConfigurations();

    ConfigurationDTO createConfiguration(ConfigurationDTO configuration);

    ConfigurationDTO updateConfiguration(ConfigurationDTO configuration);

    boolean checkIfAlreadyExists(ConfigurationDTO configuration);

    Optional<ConfigurationDTO> getConfigurationById(long id);

    void deleteConfiguration(long id);

    List<ConfigurationDTO> getConfigurationsForOrganization(String organizationId);

}
