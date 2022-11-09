package com.valleon.ipldashboard.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.valleon.ipldashboard.model.Team;
import com.valleon.ipldashboard.repository.MatchRepository;
import com.valleon.ipldashboard.repository.TeamRepository;

@RestController
public class TeamController {

    private TeamRepository teamRepository;
    private MatchRepository matchRepository;

    

public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }



@GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName){
            Team team;
            return team = this.teamRepository.findbyTeamByName(teamName);
    }
    
}
