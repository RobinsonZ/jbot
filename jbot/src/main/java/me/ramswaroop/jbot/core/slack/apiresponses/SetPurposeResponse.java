package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SetPurposeResponse extends ApiResponse {
	private String purpose;
	
	public String getPurpose() {
		return purpose;
	}
}
