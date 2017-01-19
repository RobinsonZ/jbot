package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Purpose {
	private String value;
	private String creator;
	@JsonProperty("last_set")
	private String lastSet;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getLastSet() {
		return lastSet;
	}
	public void setLastSet(String lastSet) {
		this.lastSet = lastSet;
	}
}
