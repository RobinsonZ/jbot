package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UsersGetPresenceResponse extends ApiResponse {
	private String presence;

	public String getPresence() {
		return presence;
	}
}
