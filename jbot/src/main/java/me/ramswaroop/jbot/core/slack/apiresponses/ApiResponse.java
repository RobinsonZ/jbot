package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/** Basic class for a response from the Slack Web API. All other response classes extend this one.
 * @author RobinsonZ
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
	private boolean ok;
	private String warning;
	private String error;
	
	public boolean ok() {return ok;}
	public boolean hasWarning() {return warning != null;}
	public String getWarning() {return warning;}
	public String getError() {return error;}
}
