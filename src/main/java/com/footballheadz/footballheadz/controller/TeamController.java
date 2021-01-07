package com.footballheadz.footballheadz.controller;

import com.footballheadz.footballheadz.model.Team;
import com.footballheadz.footballheadz.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teams")
public class TeamController {

    @Autowired
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Team> findAll() {
        return teamService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Team> findById(@PathVariable("id") int id) {
        return teamService.findById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    Team saveTeam(@RequestBody Team team){
        return teamService.saveTeam(team);
    }

}
