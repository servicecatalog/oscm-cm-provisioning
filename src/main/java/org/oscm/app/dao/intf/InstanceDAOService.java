package org.oscm.app.dao.intf;

import org.oscm.app.domain.Instance;
import org.oscm.app.dto.InstanceDTO;

import java.util.List;

public interface InstanceDAOService {

    InstanceDTO create(InstanceDTO instanceDTO);

    InstanceDTO findById(long id);

    List<InstanceDTO> findAll();
}
