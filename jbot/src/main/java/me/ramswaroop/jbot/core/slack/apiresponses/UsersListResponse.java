package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.User;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersListResponse extends ApiResponse {
	private User[] members;

	public User[] getMembers() {
		return members;
	}

}
