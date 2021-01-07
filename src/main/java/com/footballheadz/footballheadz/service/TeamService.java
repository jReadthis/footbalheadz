package com.footballheadz.footballheadz.service;

import com.footballheadz.footballheadz.model.Team;

import java.util.List;
import java.util.Optional;

public interface TeamService {

    List<Team> findAll();

    Optional<Team> findById(int id);

    Team saveTeam(Team team);
}
