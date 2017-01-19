package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.Message;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChatMessageResponse extends ChatResponse {
	private Message message;

	public Message getMessage() {
		return message;
	}
}
