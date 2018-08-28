package org.oscm.app.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;
import org.oscm.app.dao.InstanceDAOServiceDB;
import org.oscm.app.dao.intf.InstanceDAOService;
import org.oscm.app.domain.Instance;
import org.oscm.app.domain.ProvisioningStatus;
import org.oscm.app.dto.InstanceDTO;
import org.oscm.app.repository.InstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
public class InstanceDAOServiceDBTest {

    @TestConfiguration
    public static class InstanceDAOServiceDBTestConfiguration {

        @Bean
        public InstanceDAOService instanceDAOService() {
            return new InstanceDAOServiceDB();
        }

        @Bean
        public ModelMapper modelMapper() {
            return new ModelMapper();
        }
    }

    @Autowired
    private InstanceDAOService service;

    @MockBean
    private InstanceRepository repository;

    @Test
    public void testFindById() {

        //given
        Instance instance = new Instance();
        instance.setOrganizationId("sampleOrgId");
        instance.setReferenceId("13de453w");
        instance.setControllerId("ess.vmware");
        instance.setProvisioningStatus(ProvisioningStatus.COMPLETED);
        instance.setSubscriptionId("sub_3451245");
        Mockito.when(repository.findById(1l)).thenReturn(Optional.of(instance));

        //when
        InstanceDTO instanceDTO = service.findById(1);

        //then
        assertEquals(instanceDTO.getOrganizationId(), instance.getOrganizationId());
        assertEquals(instanceDTO.getReferenceId(), instance.getReferenceId());
        assertEquals(instanceDTO.getControllerId(), instance.getControllerId());
        assertEquals(instanceDTO.getProvisioningStatus(), instance.getProvisioningStatus());
        assertEquals(instanceDTO.getSubscriptionId(), instance.getSubscriptionId());
    }


}
