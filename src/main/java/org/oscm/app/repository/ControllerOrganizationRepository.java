package org.oscm.app.repository;

import org.oscm.app.domain.ControllerOrganization;
import org.oscm.app.domain.enumeration.Controller;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ControllerOrganizationRepository extends JpaRepository<ControllerOrganization, Long> {

    List<ControllerOrganization> findByController(Controller controller);

    List<ControllerOrganization> findByOrganizationId(String organizationId);

    Optional<ControllerOrganization> findByOrganizationIdAndController(String organizationId, Controller controller);
}
