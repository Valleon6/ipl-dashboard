package com.valleon.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.valleon.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository <Team, Long>{
   Team findbyTeamByName (String teamName);
    
}
