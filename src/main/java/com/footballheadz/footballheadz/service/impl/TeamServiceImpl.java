package com.footballheadz.footballheadz.service.impl;

import com.footballheadz.footballheadz.model.Team;
import com.footballheadz.footballheadz.repository.TeamRepository;
import com.footballheadz.footballheadz.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    @Override
    public Optional<Team> findById(int id) {
        return teamRepository.findById(id);
    }

    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }
}
