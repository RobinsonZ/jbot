package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.Channel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChannelsListResponse extends ApiResponse {
	private Channel[] channels;

	public Channel[] getChannels() {
		return channels;
	}
}
