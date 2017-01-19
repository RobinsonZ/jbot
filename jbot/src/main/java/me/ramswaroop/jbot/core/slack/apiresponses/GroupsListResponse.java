package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.Group;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GroupsListResponse extends ApiResponse {
	private Group[] groups;

	public Group[] getGroups() {
		return groups;
	}
}
