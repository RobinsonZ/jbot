package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.Team;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamInfoResponse extends ApiResponse {
	private Team team;

	public Team getTeam() {
		return team;
	}
	
}
