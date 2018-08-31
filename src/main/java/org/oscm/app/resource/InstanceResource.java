package org.oscm.app.resource;

import org.oscm.app.dto.InstanceAttributeDTO;
import org.oscm.app.dto.InstanceParameterDTO;
import org.oscm.app.exception.ObjectNotFoundException;
import org.oscm.app.service.intf.InstanceService;
import org.oscm.app.dto.InstanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class InstanceResource {

    @Autowired
    private InstanceService instanceService;

    @GetMapping("/instances")
    public List<InstanceDTO> getInstances() {

        return instanceService.findAll();
    }

    /**
     * Retrieves the instance with its parameters and attributes
     *
     * @param id the unique id of instance
     * @return   the instance details
     */
    @GetMapping("/instances/{id}")
    public InstanceDTO getInstance(@PathVariable Long id) {

        Optional<InstanceDTO> instance = instanceService.findById(id);
        if(!instance.isPresent()){
            handleInstanceNotFound(id);
        }
        return instance.get();
    }

    /**
     * Gets all parameters for instance with specific id
     *
     * @param id the unique id of instance
     * @return   the list of instance's parameters
     */
    @GetMapping("/instances/{id}/parameters")
    public List<InstanceParameterDTO> getParameters(@PathVariable Long id) {

        Optional<InstanceDTO> instance = instanceService.findById(id);
        if(!instance.isPresent()){
            handleInstanceNotFound(id);
        }
        return instance.get().getParameters();
    }

    /**
     * Gets all attributes for instance with specific id
     *
     * @param id the unique id of instance
     * @return   the list of instance's attributes
     */
    @GetMapping("/instances/{id}/attributes")
    public List<InstanceAttributeDTO> getAttribiutes(@PathVariable Long id) {

        Optional<InstanceDTO> instance = instanceService.findById(id);
        if(!instance.isPresent()){
            handleInstanceNotFound(id);
        }
        return instance.get().getAttributes();
    }


    @PostMapping("/instances")
    public ResponseEntity<InstanceDTO> createInstance(@Valid @RequestBody InstanceDTO instanceDTO) {

        InstanceDTO createdInstance = instanceService.create(instanceDTO);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdInstance
                .getId()).toUri();
        return ResponseEntity.created(location).build();
    }

    private void handleInstanceNotFound(Long id) {

        throw new ObjectNotFoundException("Instance [id="+id+"] has not been found");
    }


}
