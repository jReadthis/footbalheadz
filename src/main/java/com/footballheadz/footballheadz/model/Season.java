package com.footballheadz.footballheadz.model;

import javax.persistence.*;

@Entity
public class Season {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int year;

    private int numTeams;

    @OneToOne
    @JoinColumn(name = "team_id", insertable = false, updatable = false)
    private Team champion;

    @OneToOne
    @JoinColumn(name = "team_id", insertable = false, updatable = false)
    private Team runnerUp;

    @OneToOne
    @JoinColumn(name = "owner_id")
    private Owner manager;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumTeams() {
        return numTeams;
    }

    public void setNumTeams(int numTeams) {
        this.numTeams = numTeams;
    }

    public Team getChampion() {
        return champion;
    }

    public void setChampion(Team champion) {
        this.champion = champion;
    }

    public Team getRunnerUp() {
        return runnerUp;
    }

    public void setRunnerUp(Team runnerUp) {
        this.runnerUp = runnerUp;
    }

    public Owner getManager() {
        return manager;
    }

    public void setManager(Owner manager) {
        this.manager = manager;
    }
}
