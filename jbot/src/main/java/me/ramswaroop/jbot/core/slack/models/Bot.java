package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ramswaroop on 14/06/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bot {
    private String id;
    @JsonProperty("app_id")
    private String appId;
    private boolean deleted;
    private String name;
    private BotIcon icons;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BotIcon getIcons() {
        return icons;
    }

    public void setIcons(BotIcon icons) {
        this.icons = icons;
    }
    
    public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@JsonIgnoreProperties(ignoreUnknown=true)
    public class BotIcon {
    	@JsonProperty("image_36")
    	private String image36;
    	@JsonProperty("image_48")
    	private String image48;
    	@JsonProperty("image_72")
    	private String image72;
    }
}
