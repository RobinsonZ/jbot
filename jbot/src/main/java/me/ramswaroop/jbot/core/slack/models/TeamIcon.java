package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamIcon {
	@JsonProperty("image_34")
	String image34;
	@JsonProperty("image_44")
	String image44;
	@JsonProperty("image_68")
	String image68;
	@JsonProperty("image_88")
	String image88;
	@JsonProperty("image_102")
	String image102;
	@JsonProperty("image_132")
	String image132;
	@JsonProperty("image_default")
	boolean imageDefault;
	
	public String getImage34() {
		return image34;
	}
	public String getImage44() {
		return image44;
	}
	public String getImage68() {
		return image68;
	}
	public String getImage88() {
		return image88;
	}
	public String getImage102() {
		return image102;
	}
	public String getImage132() {
		return image132;
	}
	public boolean isImageDefault() {
		return imageDefault;
	}
}
