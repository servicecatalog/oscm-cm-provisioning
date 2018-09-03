package org.oscm.app.resource;

import org.oscm.app.dto.ControllerDTO;
import org.oscm.app.dto.ControllerOrganizationDTO;
import org.oscm.app.service.intf.ControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerResource {

    @Autowired
    private ControllerService controllerService;

    @GetMapping("/controllers")
    public List<ControllerDTO> getAllControllers(){
        return controllerService.getAvailableControllers();
    }

    @PostMapping("/organizations")
    public void createControllerOrganization(@RequestBody ControllerOrganizationDTO organization){
        controllerService.createControllerOrganization(organization);
    }

    @GetMapping("/organizations")
    public List<ControllerOrganizationDTO> getAllControllerOrganizations(){
        return controllerService.getAllControllerOrganizations();
    }

    @GetMapping(value = "/organizations", params = {"controllerId"})
    public List<ControllerOrganizationDTO> getControllerOrganizations(@RequestParam("controllerId") String controllerId){
        return controllerService.getControllerOrganizations(controllerId);
    }
}
