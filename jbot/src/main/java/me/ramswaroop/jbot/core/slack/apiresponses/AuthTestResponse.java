package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthTestResponse extends ApiResponse {
	private String url;
	private String team;
	private String user;
	@JsonProperty("team_id")
	private String teamId;
	@JsonProperty("user_id")
	private String userId;
	
	public String getUrl() {
		return url;
	}
	public String getTeam() {
		return team;
	}
	public String getUser() {
		return user;
	}
	public String getTeamId() {
		return teamId;
	}
	public String getUserId() {
		return userId;
	}
}
