package org.oscm.app.domain;

import org.oscm.app.domain.enumeration.Controller;

import javax.persistence.*;
import java.util.List;

@Entity
public class ControllerOrganization {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Controller controller;

    @Column(nullable = false)
    private String organizationId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "controllerOrganization", fetch = FetchType.LAZY)
    private List<ControllerSetting> settings;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
}
