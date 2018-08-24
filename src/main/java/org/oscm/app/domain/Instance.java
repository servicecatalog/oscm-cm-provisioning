package org.oscm.app.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Instance {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String organizationId;

    private String organizationName;

    @Column(nullable = false)
    private String subscriptionId;

    private String referenceId;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ProvisioningStatus provisioningStatus;

    private String provisioningMsg;

    @Column(nullable = false)
    private LocalDateTime requestTime;


    @Column(nullable = false)
    private String instanceId;

    @Column(nullable = false)
    private String controllerId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviceInstance", fetch = FetchType.LAZY)
    private List<InstanceParameter> instanceParameters = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "serviceInstance", fetch = FetchType.LAZY)
    private List<InstanceAttribute> instanceAttributes = new ArrayList<>();

}
