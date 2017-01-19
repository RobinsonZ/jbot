package me.ramswaroop.jbot.core.slack.apiresponses;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmojiListResponse extends ApiResponse {
	private Map<String, String> emoji;

	public Map<String, String> getEmoji() {
		return emoji;
	}
}
