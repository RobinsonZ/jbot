package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import me.ramswaroop.jbot.core.slack.models.Message;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HistoryResponse extends ApiResponse {
	private String latest;
	private Message[] messages;
	@JsonProperty("has_more")
	private boolean hasMore;
	
	public String getLatest() {
		return latest;
	}
	public Message[] getMessages() {
		return messages;
	}
	public boolean hasMore() {
		return hasMore;
	}
}
