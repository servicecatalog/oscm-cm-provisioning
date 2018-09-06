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

    @PutMapping("/")
    public ResponseEntity<InstanceDTO> updateInstance(@RequestBody InstanceDTO instanceDTO){


        Optional<InstanceDTO> result = instanceService.findById(instanceDTO.getId());
        if(result.isPresent()){
            Map<String, String> keyToValue = instanceDTO.getAttributes().stream().collect(Collectors.toMap(
                    InstanceAttributeDTO::getKey,
                    InstanceAttributeDTO::getValue
            ));
            for (InstanceAttributeDTO instanceAttributeDTO : result.get().getAttributes()) {
                String newValue = keyToValue.get(instanceAttributeDTO.getKey());
                if(newValue != null) {
                    instanceAttributeDTO.setValue(newValue);
                    keyToValue.remove(instanceAttributeDTO.getKey());
                }
            }
            for (InstanceAttributeDTO instanceAttributeDTO : instanceDTO.getAttributes()) {
                if(keyToValue.containsKey(instanceAttributeDTO.getKey())) {
                    result.get().getAttributes().add(instanceAttributeDTO);
                }
            }

            Map<String, String> keyToValueParam = instanceDTO.getParameters().stream().collect(Collectors.toMap(
                    InstanceParameterDTO::getKey,
                    InstanceParameterDTO::getValue
            ));
            for (InstanceParameterDTO instanceParameterDTO : result.get().getParameters()) {
                String newValue = keyToValueParam.get(instanceParameterDTO.getKey());
                if(newValue != null) {
                    instanceParameterDTO.setValue(newValue);
                    keyToValueParam.remove(instanceParameterDTO.getKey());
                }
            }
            for (InstanceAttributeDTO instanceAttributeDTO : instanceDTO.getAttributes()) {
                if(keyToValueParam.containsKey(instanceAttributeDTO.getKey())) {
                    result.get().getAttributes().add(instanceAttributeDTO);
                }
            }


            instanceService.save(instanceDTO);
            return ResponseEntity.ok(instanceDTO);
        }
        else return ResponseEntity.badRequest().body(instanceDTO);

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
