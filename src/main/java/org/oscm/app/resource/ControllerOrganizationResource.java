package org.oscm.app.resource;

import org.oscm.app.dto.ControllerDTO;
import org.oscm.app.dto.ControllerOrganizationDTO;
import org.oscm.app.service.intf.ControllerOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class ControllerOrganizationResource {

    @Autowired
    private ControllerOrganizationService controllerOrganizationService;

    @GetMapping("/controllers")
    public List<ControllerDTO> getAllControllers(){

        return controllerOrganizationService.getAvailableControllers();
    }

    @PostMapping("/organizations")
    public ResponseEntity<ControllerOrganizationDTO> createControllerOrganization(@RequestBody ControllerOrganizationDTO organization){

        ControllerOrganizationDTO orgDTO = controllerOrganizationService.createControllerOrganization(organization);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(orgDTO.getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @GetMapping("/organizations")
    public List<ControllerOrganizationDTO> getAllControllerOrganizations(){

        return controllerOrganizationService.getAllControllerOrganizations();
    }

    @GetMapping(value = "/organizations", params = {"controllerId"})
    public List<ControllerOrganizationDTO> getControllerOrganizations(@RequestParam("controllerId") String controllerId){

        return controllerOrganizationService.getControllerOrganizations(controllerId);
    }
}
