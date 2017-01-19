package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ThreadInfo {
	public boolean complete;
	public int count;
	
	public boolean isComplete() {
		return complete;
	}
	public int getCount() {
		return count;
	}

}
