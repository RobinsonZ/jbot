package me.ramswaroop.jbot.core.slack.models;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiResponse {
	private boolean ok;
	private String warning;
	private String error;
	
	//method specific params 
	
	//auth.revoke
	private boolean revoked;
	
	//auth.test
	private String url;
	@JsonProperty("team")
	private String teamName;
	@JsonProperty("user")
	private String userName;
	@JsonProperty("team_id")
	private String teamId;
	@JsonProperty("user_id")
	private String userId;
	
	//bots.info
	private Bot bot;
	
	//channels.create, channels.info, channels.invite, channels.join, channels.rename, 
	private Channel channel;
	
	//channels.history, groups.history, im.history, mpim.history
	private Message[] messages;
	private String latest;
	@JsonProperty("has_more")
	private boolean hasMore;
	
	//channels.join
	@JsonProperty("already_in_channel")
	private boolean alreadyInChannel;
	
	//channels.list
	private Channel[] channels;
	
	//channels.setPurpose, groups.setPurpose
	private String purpose;
	
	//channels.setTopic, groups.setTopic
	private String topic;
	
	//chat.delete, chat.meMessage, chat.postMessage, chat.update
	@JsonProperty("channel")
	private String channelId;
	String ts;
	
	//chat.postMessage
	private Message message;
	
	//chat.update
	private String text;
	
	//dnd.info
	@JsonProperty("dnd_enabled")
	private boolean dndEnabled;
	@JsonProperty("next_dnd_start_ts")
	private long nextDndStartTs;
	@JsonProperty("next_dnd_end_ts")
	private long nextDndEndTs;
	
	//dnd.teamInfo
	private Map<String, DndUserData> users;
	
	//emoji.list
	private Map<String, String> emoji;
	
	//files.comments.add, files.comments.edit
	Comment comment;
	
	//files.info, files.revokePublicURL, files.sharedPublicURL, files.upload
	File file;
	
	//files.list, reactions.list
	Paging paging;
	
	//files.list
	File[] files;
	
	//groups.create, groups.createChild, groups.info, groups.invite, groups.rename, mpim.open
	Group group;
	
	//groups.list, mpim.list
	Group[] groups;
	
	//groups.open, im.open, mpim.open
	@JsonProperty("no_op")
	private boolean noOp;
	@JsonProperty("already_open")
	private boolean alreadyOpen;
	
	//im.list
	Im[] ims;
	
	//im.info
	@JsonProperty("channel")
	Im im;
	
	//pins.list, reactions.list
	Item[] items;
	
	//team.info
	Team team;
	
	//users.getPresence
	String presence;
	
	//users.info
	User user;
	
	//users.list
	User[] members;
	
	//users.profile.get
	Profile profile;

	public boolean isOk() {
		return ok;
	}

	public String getWarning() {
		return warning;
	}

	public String getError() {
		return error;
	}

	public boolean isRevoked() {
		return revoked;
	}

	public String getUrl() {
		return url;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getUserName() {
		return userName;
	}

	public String getTeamId() {
		return teamId;
	}

	public String getUserId() {
		return userId;
	}

	public Bot getBot() {
		return bot;
	}

	public Channel getChannel() {
		return channel;
	}

	public Message[] getMessages() {
		return messages;
	}

	public String getLatest() {
		return latest;
	}

	public boolean isHasMore() {
		return hasMore;
	}

	public boolean isAlreadyInChannel() {
		return alreadyInChannel;
	}

	public Channel[] getChannels() {
		return channels;
	}

	public String getPurpose() {
		return purpose;
	}

	public String getTopic() {
		return topic;
	}

	public String getChannelId() {
		return channelId;
	}

	public String getTs() {
		return ts;
	}

	public Message getMessage() {
		return message;
	}

	public String getText() {
		return text;
	}

	public boolean isDndEnabled() {
		return dndEnabled;
	}

	public long getNextDndStartTs() {
		return nextDndStartTs;
	}

	public long getNextDndEndTs() {
		return nextDndEndTs;
	}

	public Map<String, DndUserData> getUsers() {
		return users;
	}

	public Map<String, String> getEmoji() {
		return emoji;
	}

	public Comment getComment() {
		return comment;
	}

	public File getFile() {
		return file;
	}

	public Paging getPaging() {
		return paging;
	}

	public File[] getFiles() {
		return files;
	}

	public Group getGroup() {
		return group;
	}

	public Group[] getGroups() {
		return groups;
	}

	public boolean isNoOp() {
		return noOp;
	}

	public boolean isAlreadyOpen() {
		return alreadyOpen;
	}

	public Im[] getIms() {
		return ims;
	}

	public Im getIm() {
		return im;
	}

	public Item[] getItems() {
		return items;
	}

	public Team getTeam() {
		return team;
	}

	public String getPresence() {
		return presence;
	}

	public User getUser() {
		return user;
	}

	public User[] getMembers() {
		return members;
	}

	public Profile getProfile() {
		return profile;
	}
	
	
}
