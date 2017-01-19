package me.ramswaroop.jbot.core.slack.apiresponses;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiTestResponse extends ApiResponse {
	public Map<String, String> args;
}
