package org.oscm.app.resource;

import org.oscm.app.dto.InstanceAttributeDTO;
import org.oscm.app.dto.InstanceParameterDTO;
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
@RequestMapping("instances")
public class InstanceResource {

    @Autowired
    private InstanceService instanceService;

    @GetMapping("/")
    public List<InstanceDTO> getInstances() {

        return instanceService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<InstanceDTO> getInstance(@PathVariable Long id) {

        return instanceService.findOne(id);
    }

    /**
     * Gets all parameters for instance with specific id
     * @param id for instance
     * @return
     */
    @GetMapping("/{id}/param")
    public List<InstanceParameterDTO> getParameters(@PathVariable Long id) {
        Optional<InstanceDTO> instance = instanceService.findOne(id);
        if(instance.isPresent()){
            return instance.get().getParameters();
        }
        else return Collections.emptyList();

    }

    /**
     * Gets all attribiutes for instance with specific id
     * @param id
     * @return
     */

    @GetMapping("/{id}/attr")
    public List<InstanceAttributeDTO> getAttribiutes(@PathVariable Long id) {
        Optional<InstanceDTO> instance = instanceService.findOne(id);
        if (instance.isPresent()){
            return instance.get().getAttributes();
        }
        else return Collections.emptyList();
    }


    @PostMapping("/")
    public ResponseEntity<InstanceDTO> createInstance(@Valid @RequestBody InstanceDTO instanceDTO) {

        InstanceDTO createdInstance = instanceService.create(instanceDTO);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdInstance.getId()).toUri();
        return ResponseEntity.created(location).build();
    }


}
