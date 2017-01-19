package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.File;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilesResponse extends ApiResponse {
	private File file;

	public File getFile() {
		return file;
	}
}
