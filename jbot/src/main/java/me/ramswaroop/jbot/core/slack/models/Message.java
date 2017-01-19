package me.ramswaroop.jbot.core.slack.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import me.ramswaroop.jbot.core.slack.models.Bot.BotIcon;

/**
 * Created by ramswaroop on 14/06/2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Message {
	//General params
	private int id;
    private String ts;
    private String type;
    private String subtype;
    private boolean hidden;
    private String channel;
    private String user;
    private String text;
    @JsonProperty("is_starred")
    private boolean isStarred;
    @JsonProperty("pinned_to")
    private String[] pinnedTo;
    private Reaction[] reactions;
    private Edited edited;
    @JsonProperty("thread_ts")
    private String threadTs;
    
    //Subtype-specific params
    
    //bot_message
    @JsonProperty("bot_id")
    private String botId;
    private String username;
    private BotIcon icons;
    
    //channel_archive, group_archive
    private String[] members;
    
    //channel_name, group_name
    @JsonProperty("old_name")
    private String oldName;
    private String name;
    
    //channel_purpose, group_purpose
    private String purpose;
    
    //channel_topic, group_topic
    private String topic;
    
    //file_comment, file_mention, file_share
    private File file;
    
    //file_comment
    private Comment comment;
    
    //file_share
    private boolean upload;
    
    //message_changed, message_replied
    private Message message;
    
    //message_replied
    @JsonProperty("event_ts")
    private long eventTs;
    
    //message_deleted
    @JsonProperty("deleted_ts")
    private long deletedTs;
   
    //pinned_item, unpinned_item
    @JsonProperty("item_type")
    private String itemType;
    private Item item;

    public Message() {}
    
    public Message(String text) {
        this.text = text;
    }

    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String toJSONString() throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(this);
    }

	public int getId() {
		return id;
	}

	public String getSubtype() {
		return subtype;
	}

	public boolean isHidden() {
		return hidden;
	}

	public boolean isStarred() {
		return isStarred;
	}

	public String[] getPinnedTo() {
		return pinnedTo;
	}

	public Reaction[] getReactions() {
		return reactions;
	}

	public Edited getEdited() {
		return edited;
	}

	public String getThreadTs() {
		return threadTs;
	}

	public String getBotId() {
		return botId;
	}

	public String getUsername() {
		return username;
	}

	public BotIcon getIcons() {
		return icons;
	}

	public String[] getMembers() {
		return members;
	}

	public String getOldName() {
		return oldName;
	}

	public String getName() {
		return name;
	}

	public String getPurpose() {
		return purpose;
	}

	public String getTopic() {
		return topic;
	}

	public File getFile() {
		return file;
	}

	public Comment getComment() {
		return comment;
	}

	public boolean isUpload() {
		return upload;
	}

	public Message getMessage() {
		return message;
	}

	public long getEventTs() {
		return eventTs;
	}

	public long getDeletedTs() {
		return deletedTs;
	}

	public String getItemType() {
		return itemType;
	}

	public Item getItem() {
		return item;
	}
}
