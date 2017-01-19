package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthRevokeResponse extends ApiResponse {
	boolean revoked;
	
	public boolean isRevoked() {return revoked;}
}
