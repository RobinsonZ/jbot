package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatResponse extends ApiResponse {
	private String channel;
	private String ts;
	
	public String getChannel() {
		return channel;
	}
	public String getTs() {
		return ts;
	}
}
