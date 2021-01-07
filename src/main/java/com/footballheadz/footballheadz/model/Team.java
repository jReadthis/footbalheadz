package com.footballheadz.footballheadz.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String teamName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    private Owner owner;

    private Date activeSince;

    private boolean activeStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Date getActiveSince() {
        return activeSince;
    }

    public void setActiveSince(Date activeSince) {
        this.activeSince = activeSince;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
}
