package io.javalearn.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.javalearn.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);

}
