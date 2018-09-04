package org.oscm.app.service;

import org.modelmapper.ModelMapper;
import org.oscm.app.domain.Configuration;
import org.oscm.app.domain.enumeration.Controller;
import org.oscm.app.dto.ConfigurationDTO;
import org.oscm.app.dto.ControllerDTO;
import org.oscm.app.repository.ConfigurationRepository;
import org.oscm.app.service.intf.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    @Autowired
    private ConfigurationRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<ControllerDTO> getAvailableControllers() {

        List<Controller> controllers = Arrays.asList(Controller.values());
        List<ControllerDTO> mappedControllers = controllers.stream()
                                                           .map(controller -> mapper.map(controller, ControllerDTO.class))
                                                           .collect(Collectors.toList());
        return mappedControllers;
    }

    @Override
    public ConfigurationDTO createConfiguration(ConfigurationDTO configuration) {

        Configuration organization = toConfiguration(configuration);
        Configuration createdOrganization = repository.save(organization);

        return toConfigurationDTO(createdOrganization);
    }

    @Override
    public ConfigurationDTO updateConfiguration(ConfigurationDTO configuration) {

        String orgId = configuration.getOrganizationId();
        String controllerId = configuration.getControllerId();

        Configuration storedConfiguration = repository.getOne(configuration.getId());
        storedConfiguration.setOrganizationId(orgId);
        storedConfiguration.setController(getControllerById(controllerId).get());

        Configuration createdOrganization = repository.save(storedConfiguration);

        return toConfigurationDTO(createdOrganization);
    }

    @Override
    public List<ConfigurationDTO> getAllConfigurations() {

        List<Configuration> configurations = repository.findAll();
        List<ConfigurationDTO> dtos = configurations.stream()
                                                   .map(c -> toConfigurationDTO(c))
                                                   .collect(Collectors.toList());
        return dtos;
    }

    @Override
    public boolean checkIfAlreadyExists(ConfigurationDTO configuration) {

        String controllerId = configuration.getControllerId();
        String orgId = configuration.getOrganizationId();
        Optional<Controller> controller = getControllerById(controllerId);

        Optional<Configuration> optional = repository.findByOrganizationIdAndController(orgId, controller.get());

        return optional.isPresent();
    }

    @Override
    public Optional<ConfigurationDTO> getConfigurationById(long id) {

        Optional<Configuration> configuration = repository.findById(id);
        if(configuration.isPresent()){
            ConfigurationDTO configurationDTO = toConfigurationDTO(configuration.get());
            return Optional.of(configurationDTO);
        }

        return Optional.empty();
    }

    @Override
    public void deleteConfiguration(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<ConfigurationDTO> getConfigurationsForOrganization(String organizationId) {
        List<Configuration> configurations = repository.findByOrganizationId(organizationId);
        List<ConfigurationDTO> dtos = configurations.stream()
                                                   .map(c -> toConfigurationDTO(c))
                                                   .collect(Collectors.toList());
        return dtos;
    }


    private Configuration toConfiguration(ConfigurationDTO dto) {

        String controllerId = dto.getControllerId();
        Optional<Controller> controller = getControllerById(controllerId);

        Configuration configuration = new Configuration();
        configuration.setOrganizationId(dto.getOrganizationId());
        configuration.setController(controller.get());

        return configuration;
    }

    private ConfigurationDTO toConfigurationDTO(Configuration configuration) {

        ConfigurationDTO dto = new ConfigurationDTO();
        dto.setId(configuration.getId());
        dto.setOrganizationId(configuration.getOrganizationId());
        dto.setControllerId(configuration.getController().getControllerId());

        return dto;
    }

    private Optional<Controller> getControllerById(String controllerId) {

        Stream<Controller> controllers = Arrays.stream(Controller.values());
        Optional<Controller> controller = controllers.filter(c -> c.getControllerId().equals(controllerId)).findFirst();
        return controller;
    }
}
