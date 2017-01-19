package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DndInfoResponse extends ApiResponse {
	@JsonProperty("dnd_enabled")
	private boolean dndEnabled;
	@JsonProperty("next_dnd_start_ts")
	private long nextDndStartTs;
	@JsonProperty("next_dnd_end_ts")
	private long nextDndEndTs;
	
	public boolean isDndEnabled() {
		return dndEnabled;
	}
	public long getNextDndStartTs() {
		return nextDndStartTs;
	}
	public long getNextDndEndTs() {
		return nextDndEndTs;
	}
}
