package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SetTopicResponse extends ApiResponse {
	private String topic;

	public String getTopic() {
		return topic;
	}
}
