package me.ramswaroop.jbot.core.slack.apiresponses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import me.ramswaroop.jbot.core.slack.models.Item;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemListResponse extends ApiResponse {
	private Item[] items;

	public Item[] getItems() {
		return items;
	}
}
