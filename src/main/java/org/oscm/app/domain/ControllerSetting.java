package org.oscm.app.domain;

import javax.persistence.*;

@Entity
public class ControllerSetting {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String key;

    @Column(nullable = false)
    private String value;

    @ManyToOne(fetch = FetchType.LAZY)
    private ControllerOrganization controllerOrganization;
}
