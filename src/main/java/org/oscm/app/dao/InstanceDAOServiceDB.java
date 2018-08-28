package org.oscm.app.dao;

import org.modelmapper.ModelMapper;
import org.oscm.app.dao.intf.InstanceDAOService;
import org.oscm.app.domain.Instance;
import org.oscm.app.domain.ProvisioningStatus;
import org.oscm.app.dto.InstanceDTO;
import org.oscm.app.repository.InstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class InstanceDAOServiceDB implements InstanceDAOService {

    @Autowired
    private InstanceRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public InstanceDTO create(InstanceDTO instanceDTO) {

        Instance instance = mapper.map(instanceDTO, Instance.class);

        instance.getInstanceParameters().forEach(param->param.setInstance(instance));
        instance.getInstanceAttributes().forEach(att->att.setInstance(instance));

        instance.setRequestTime(LocalDateTime.now(ZoneId.systemDefault()));
        instance.setProvisioningStatus(ProvisioningStatus.WAITING_FOR_SYSTEM_CREATION);
        instance.setInstanceId("some_generated_id");

        Instance createdInstance = repository.save(instance);
        InstanceDTO mappedInstance = mapper.map(createdInstance, InstanceDTO.class);

        return mappedInstance;
    }

    @Override
    public InstanceDTO findById(long id) {

        Optional<Instance> instance = repository.findById(id);
        InstanceDTO mappedInstance = mapper.map(instance.get(), InstanceDTO.class);

        return mappedInstance;
    }

    @Override
    public List<InstanceDTO> findAll() {

        List<Instance> instances = repository.findAll();
        List<InstanceDTO> mappedInstances = instances.stream().map(i -> mapper.map(i, InstanceDTO.class)).collect(Collectors.toList());

        return mappedInstances;
    }
}
