package io.javalearn.ipldashboard.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.javalearn.ipldashboard.model.Match;
import io.javalearn.ipldashboard.model.Team;
import io.javalearn.ipldashboard.repository.MatchRepository;
import io.javalearn.ipldashboard.repository.TeamRepository;

@RestController
@CrossOrigin
public class TeamController {

    private TeamRepository teamRepository;
    private MatchRepository matchRepository;

    public TeamController(TeamRepository teamRepository, MatchRepository matchRepository) {
        this.teamRepository = teamRepository;
        this.matchRepository = matchRepository;
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {
        Team team = this.teamRepository.findByTeamName(teamName);
        team.setMatches(this.matchRepository.findLatestMatchesbyTeam(teamName, 4));

        return team;
    }

    @GetMapping("/team/{teamName}/matches")
    public List<Match> getMatchesForTeam(@PathVariable String teamName,@RequestParam int year) {
        /**Here taking two dates for in between date we will get Match data  */
        LocalDate startDate = LocalDate.of(year, 1, 1); // (year,jan, 1st date of jan)
        LocalDate endDate = LocalDate.of(year + 1, 1, 1);
       return this.matchRepository.getMatchesByTeamBetweenDates(teamName, startDate, endDate);
        
    }
}
