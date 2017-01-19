package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Im {
	private String id;
	@JsonProperty("is_im")
	private boolean isIm;
	private String user;
	private long created;
	@JsonProperty("is_user_deleted")
	private boolean isUserDeleted;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isIm() {
		return isIm;
	}
	public void setIm(boolean isIm) {
		this.isIm = isIm;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public long getCreated() {
		return created;
	}
	public void setCreated(long created) {
		this.created = created;
	}
	public boolean isUserDeleted() {
		return isUserDeleted;
	}
	public void setUserDeleted(boolean isUserDeleted) {
		this.isUserDeleted = isUserDeleted;
	}
}
