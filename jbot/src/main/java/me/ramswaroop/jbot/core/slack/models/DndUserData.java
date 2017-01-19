package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DndUserData {
	@JsonProperty("dnd_enabled")
	private boolean dnd_enabled;
	@JsonProperty("next_dnd_start_ts")
	private long nextDndStartTs;
	@JsonProperty("next_dnd_end_ts")
	private long nextDndEndTs;

}
