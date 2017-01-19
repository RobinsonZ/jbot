package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Paging {
	private int count;
	private int total;
	private int page;
	private int pages;
	
	public int getCount() {
		return count;
	}
	public int getTotal() {
		return total;
	}
	public int getPage() {
		return page;
	}
	public int getPages() {
		return pages;
	}
}
