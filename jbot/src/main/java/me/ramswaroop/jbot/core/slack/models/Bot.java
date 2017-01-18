package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ramswaroop on 14/06/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bot {
    private String id;
    private String name;
    private BotIcon icons;

    public Bot(String id, String name, BotIcon icons) {
    	this.id = id;
    	this.name = name;
    	this.icons = icons;
    }
    
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
}
