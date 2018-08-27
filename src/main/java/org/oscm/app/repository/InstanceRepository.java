package org.oscm.app.repository;

import org.oscm.app.domain.Instance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstanceRepository extends JpaRepository<Instance, Long>{
}
