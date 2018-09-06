package org.oscm.app.resource;

import io.swagger.annotations.*;
import org.oscm.app.dto.ConfigurationDTO;
import org.oscm.app.dto.ControllerDTO;
import org.oscm.app.exception.ExceptionResponse;
import org.oscm.app.exception.ObjectNotFoundException;
import org.oscm.app.exception.ValidationException;
import org.oscm.app.service.intf.ConfigurationService;
import org.oscm.app.util.ApiParamValue;
import org.oscm.app.util.HttpStatusMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Api("Operations related to configuration resource")
@RestController
public class ConfigurationResource {

    @Autowired
    private ConfigurationService configurationService;

    @ApiOperation("Retrieves the list of available controllers")
    @GetMapping("/controllers")
    public ResponseEntity<List<ControllerDTO>> getAllControllers() {

        List<ControllerDTO> controllers = configurationService.getAvailableControllers();
        return ResponseEntity.ok(controllers);
    }

    @ApiOperation("Retrieves the list of all configurations")
    @GetMapping("/configurations")
    public ResponseEntity<List<ConfigurationDTO>> getAllConfigurations() {

        List<ConfigurationDTO> configurations = configurationService.getAllConfigurations();
        return ResponseEntity.ok(configurations);
    }

    @ApiOperation("Retrieves the list of configurations for specific organization")
    @GetMapping(value = "/configurations", params = "organizationId")
    public ResponseEntity<List<ConfigurationDTO>> getConfigurationsForOrganization(
            @ApiParam(value = ApiParamValue.ORGANIZATION_ID, required = true)
            @RequestParam String organizationId) {

        List<ConfigurationDTO> configurations = configurationService.getConfigurationsForOrganization(organizationId);

        return ResponseEntity.ok(configurations);
    }

    @ApiOperation("Creates new configuration")
    @ApiResponses({
            @ApiResponse(code = 400, message = HttpStatusMessage.MSG_400, response = ExceptionResponse.class)
    })
    @PostMapping("/configurations")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<ConfigurationDTO> createConfiguration(
            @ApiParam(value = ApiParamValue.CONFIGURATION, required = true)
            @Valid @RequestBody ConfigurationDTO configuration) {

        checkIfConfigurationAlreadyExists(configuration);
        ConfigurationDTO createdConfiguration = configurationService.createConfiguration(configuration);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdConfiguration);
    }

    @ApiOperation("Retrieves existing configuration")
    @ApiResponses({
            @ApiResponse(code = 404, message = HttpStatusMessage.MSG_404, response = ExceptionResponse.class)
    })
    @GetMapping("/configurations/{id}")
    public ResponseEntity<ConfigurationDTO> getConfiguration(
            @ApiParam(value = ApiParamValue.CONFIGURATION_ID, required = true) @PathVariable long id) {

        Optional<ConfigurationDTO> configuration = configurationService.getConfigurationById(id);
        checkIfIdOfConfigurationIsValid(id, configuration);

        return ResponseEntity.ok(configuration.get());
    }

    @ApiOperation("Updates existing configuration")
    @ApiResponses({
            @ApiResponse(code = 400, message = HttpStatusMessage.MSG_400, response = ExceptionResponse.class),
            @ApiResponse(code = 404, message = HttpStatusMessage.MSG_404, response = ExceptionResponse.class)
    })
    @PutMapping("/configurations/{id}")
    public ResponseEntity<ConfigurationDTO> updateConfiguration(
            @ApiParam(value = ApiParamValue.CONFIGURATION_ID, required = true) @PathVariable long id,
            @ApiParam(value = ApiParamValue.CONFIGURATION, required = true)
            @Valid @RequestBody ConfigurationDTO configuration) {

        Optional<ConfigurationDTO> configurationDTO = configurationService.getConfigurationById(id);
        checkIfIdOfConfigurationIsValid(id, configurationDTO);
        configuration.setId(id);
        checkIfConfigurationAlreadyExists(configuration);
        configurationService.updateConfiguration(configuration);

        return ResponseEntity.ok().build();
    }

    @ApiOperation("Deletes configuration")
    @ApiResponses({
            @ApiResponse(code = 404, message = HttpStatusMessage.MSG_404, response = ExceptionResponse.class)
    })
    @DeleteMapping("/configurations/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Void> deleteConfiguration(
            @ApiParam(value = ApiParamValue.CONFIGURATION_ID, required = true) @PathVariable long id) {

        Optional<ConfigurationDTO> configurationDTO = configurationService.getConfigurationById(id);
        checkIfIdOfConfigurationIsValid(id, configurationDTO);
        configurationService.deleteConfiguration(id);

        return ResponseEntity.noContent().build();
    }


    private void checkIfConfigurationAlreadyExists(ConfigurationDTO configuration) {

        boolean exists = configurationService.checkIfAlreadyExists(configuration);
        if (exists) {
            String controllerId = configuration.getControllerId();
            String orgId = configuration.getOrganizationId();
            throw new ValidationException("Configuration [controllerId=" + controllerId + ", " +
                    "organizationId=" + orgId + "] already exists");
        }
    }

    private void checkIfIdOfConfigurationIsValid(long id, Optional<ConfigurationDTO> configuration) {

        configuration.orElseThrow(() -> new ObjectNotFoundException("Configuration [id=" + id + "] " +
                "has not been found"));
    }
}
