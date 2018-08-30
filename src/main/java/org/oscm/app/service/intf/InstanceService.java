package org.oscm.app.service.intf;

import org.oscm.app.dto.InstanceDTO;

import java.util.List;

public interface InstanceService {

    InstanceDTO create(InstanceDTO instanceDTO);

    InstanceDTO findById(long id);

    List<InstanceDTO> findAll();
}
