package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CloseResponse extends OpenCloseResponse {
	@JsonProperty("already_closed")
	boolean alreadyClosed;

	public boolean isAlreadyClosed() {
		return alreadyClosed;
	}
}
