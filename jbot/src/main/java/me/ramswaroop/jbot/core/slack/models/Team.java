package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
	private String id;
	private String name;
	private String domain;
	@JsonProperty("email_domain")
	private String emailDomain;
	private TeamIcon icon;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDomain() {
		return domain;
	}
	public String getEmailDomain() {
		return emailDomain;
	}
	public TeamIcon getIcon() {
		return icon;
	}
	
}
