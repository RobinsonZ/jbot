package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenCloseResponse extends ApiResponse {
	@JsonProperty("no_op")
	boolean noOp;

	public boolean isNoOp() {
		return noOp;
	}
}
