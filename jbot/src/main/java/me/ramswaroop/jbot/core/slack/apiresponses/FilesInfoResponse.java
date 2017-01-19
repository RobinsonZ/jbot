package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.Comment;
import me.ramswaroop.jbot.core.slack.models.Paging;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilesInfoResponse extends FilesResponse {
	private Comment[] comments;
	private Paging paging;
	
	public Comment[] getComments() {
		return comments;
	}
	public Paging getPaging() {
		return paging;
	}
}
