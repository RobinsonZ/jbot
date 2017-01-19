package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.User;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersInfoResponse extends ApiResponse {
	private User user;

	public User getUser() {
		return user;
	}
	
}
