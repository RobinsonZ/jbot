package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.Channel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChannelsInfoResponse {
	Channel channel;
	
	public Channel getChannel() {
		return channel;
	}
}
