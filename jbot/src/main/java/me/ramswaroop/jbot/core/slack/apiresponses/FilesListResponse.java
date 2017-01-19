package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.File;
import me.ramswaroop.jbot.core.slack.models.Paging;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilesListResponse extends ApiResponse {
	private File[] files;
	private Paging paging;
	
	public File[] getFiles() {
		return files;
	}
	public Paging getPaging() {
		return paging;
	}
}
