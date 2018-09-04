package org.oscm.app.resource;

import org.oscm.app.dto.ConfigurationDTO;
import org.oscm.app.dto.ConfigurationSettingDTO;
import org.oscm.app.dto.ControllerDTO;
import org.oscm.app.exception.ObjectNotFoundException;
import org.oscm.app.exception.ValidationException;
import org.oscm.app.service.intf.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class ConfigurationResource {

    @Autowired
    private ConfigurationService configurationService;

    @GetMapping("/controllers")
    public ResponseEntity<List<ControllerDTO>> getAllControllers(){

        List<ControllerDTO> controllers = configurationService.getAvailableControllers();
        return ResponseEntity.ok(controllers);
    }

    @GetMapping("/configurations")
    public ResponseEntity<List<ConfigurationDTO>> getAllConfigurations(){

        List<ConfigurationDTO> configurations = configurationService.getAllConfigurations();
        return ResponseEntity.ok(configurations);
    }

    @PostMapping("/configurations")
    public ResponseEntity<ConfigurationDTO> createConfiguration(@Valid @RequestBody ConfigurationDTO configuration){

        checkIfConfigurationAlreadyExists(configuration);
        configurationService.createConfiguration(configuration);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/configurations/{id}")
    public ResponseEntity<ConfigurationDTO> updateConfiguration(@PathVariable long id,
                                                                @Valid @RequestBody ConfigurationDTO configuration){

        Optional<ConfigurationDTO> configurationDTO = configurationService.getConfigurationById(id);
        checkIfIdOfConfigurationIsValid(id, configurationDTO);
        configuration.setId(id);
        checkIfConfigurationAlreadyExists(configuration);
        configurationService.updateConfiguration(configuration);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/configurations/{id}")
    public ResponseEntity<Object> deleteConfiguration(@PathVariable long id){

        Optional<ConfigurationDTO> configurationDTO = configurationService.getConfigurationById(id);
        checkIfIdOfConfigurationIsValid(id, configurationDTO);
        configurationService.deleteConfiguration(id);

        return ResponseEntity.noContent().build();
    }

    @GetMapping(value = "/configurations", params = {"organizationId"})
    public ResponseEntity<List<ConfigurationDTO>> getConfigurationsForOrganization(@RequestParam String organizationId){

        List<ConfigurationDTO> configurations = configurationService.getConfigurationsForOrganization(organizationId);
        return ResponseEntity.ok(configurations);
    }

    private void checkIfConfigurationAlreadyExists(ConfigurationDTO configuration){

        boolean exists = configurationService.checkIfAlreadyExists(configuration);
        if(exists){
            String controllerId = configuration.getControllerId();
            String orgId = configuration.getOrganizationId();
            throw new ValidationException("Configuration [controllerId="+controllerId+", organizationId="+ orgId +"] already exists");
        }
    }

    private void checkIfIdOfConfigurationIsValid(long id, Optional<ConfigurationDTO> configuration){

        configuration.orElseThrow(()-> new ObjectNotFoundException("Configuration [id="+id+"] has not been found"));
    }
}
