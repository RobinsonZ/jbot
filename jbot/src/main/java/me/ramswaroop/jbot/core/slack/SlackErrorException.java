package me.ramswaroop.jbot.core.slack;

import me.ramswaroop.jbot.core.slack.models.Error;;
public class SlackErrorException extends Exception {
	private static final long serialVersionUID = -5741501363865883218L;

	public SlackErrorException(Error error) {
		super("Slack API returned error " + error.getCode() + ":" + error.getMsg());
	}
}
