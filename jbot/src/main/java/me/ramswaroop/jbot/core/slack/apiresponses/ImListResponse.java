package me.ramswaroop.jbot.core.slack.apiresponses;

import me.ramswaroop.jbot.core.slack.models.Im;

public class ImListResponse extends ApiResponse {
	private Im[] ims;

	public Im[] getIms() {
		return ims;
	}
}
