package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.Comment;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilesCommentsResponse extends ApiResponse {
	private Comment comment;

	public Comment getComment() {
		return comment;
	}
}
