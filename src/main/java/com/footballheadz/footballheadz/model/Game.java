package com.footballheadz.footballheadz.model;

import javax.persistence.*;

@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "season_id")
    private Season season;

    @ManyToOne
    @JoinColumn(name = "team_id", insertable = false, updatable = false)
    private Team homeTeam;

    @ManyToOne
    @JoinColumn(name = "team_id", insertable = false, updatable = false)
    private Team awayTeam;

    private int weekNum;

    private double homeTeamScore;

    private double awayTeamScore;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getWeekNum() {
        return weekNum;
    }

    public void setWeekNum(int weekNum) {
        this.weekNum = weekNum;
    }

    public double getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(double homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public double getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(double awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }
}
