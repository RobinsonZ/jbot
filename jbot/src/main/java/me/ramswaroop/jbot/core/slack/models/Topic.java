package me.ramswaroop.jbot.core.slack.models;

public class Topic {
	String value;
	String creator;
	long lastSet;
	
	public Topic(String value, String creator, long lastSet) {
		this.value = value;
		this.creator = creator;
		this.lastSet = lastSet;
	}

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

	public long getLastSet() {
		return lastSet;
	}

	public void setLastSet(long lastSet) {
		this.lastSet = lastSet;
	}
}
