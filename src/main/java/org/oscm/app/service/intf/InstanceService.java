package org.oscm.app.service.intf;

import org.oscm.app.dto.InstanceDTO;

import java.util.List;
import java.util.Optional;

public interface InstanceService {

    InstanceDTO create(InstanceDTO instanceDTO);

    Optional<InstanceDTO> findById(long id);

    List<InstanceDTO> findAll();

    void save(InstanceDTO instanceDTO);
}
