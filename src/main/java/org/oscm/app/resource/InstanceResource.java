package org.oscm.app.resource;

import org.oscm.app.dao.intf.InstanceDAOService;
import org.oscm.app.dto.InstanceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
public class InstanceResource {

    @Autowired
    private InstanceDAOService instanceService;

    @GetMapping("/instances")
    public List<InstanceDTO> getInstances() {

        return instanceService.findAll();
    }

    @GetMapping("/instances/{id}")
    public InstanceDTO getInstance(@PathVariable int id) {

        return instanceService.findById(id);
    }

    @PostMapping("/instances")
    public ResponseEntity<InstanceDTO> createInstance(@Valid @RequestBody InstanceDTO instanceDTO) {

        InstanceDTO createdInstance = instanceService.create(instanceDTO);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(createdInstance.getTKey()).toUri();

        return ResponseEntity.created(location).build();
    }


}
