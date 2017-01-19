package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.Group;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupInfoResponse extends ApiResponse {
	private Group group;

	public Group getGroup() {
		return group;
	}
}
