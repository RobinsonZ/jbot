package me.ramswaroop.jbot.core.slack.apiresponses;

public enum ApiMethod {
	//Enums with no class parameter represent methods that return no special parameters
	API_TEST(ApiTestResponse.class, "api.test"), AUTH_TEST(AuthTestResponse.class, "auth.test"), AUTH_REVOKE(AuthRevokeResponse.class, "auth.revoke"),
	CHANNELS_HISTORY(HistoryResponse.class, "channels.history"), CHANNELS_INFO(ChannelsInfoResponse.class, "channels.info"),
	CHANNELS_LIST(ChannelsListResponse.class, "channels.list"), CHANNELS_SET_PURPOSE(SetPurposeResponse.class, "channels.setPurpose"), 
	CHANNELS_SET_TOPIC(SetTopicResponse.class, "channels.setTopic"), CHAT_DELETE(ChatResponse.class, "chat.delete"), CHAT_ME_MESSAGE(ChatResponse.class, "chat.meMessage"),
	CHAT_POST_MESSAGE(ChatMessageResponse.class, "chat.postMessage"), CHAT_UPDATE(ChatMessageResponse.class, "chat.update"),
	DND_INFO(DndInfoResponse.class, "dnd.info"), EMOJI_LIST(EmojiListResponse.class, "emoji.list"), FILES_COMMENTS_ADD(FilesCommentsResponse.class, "files.comments.add"),
	FILES_COMMENTS_DELETE("files.comments.delete"), FILES_COMMENTS_EDIT(FilesCommentsResponse.class, "files.comments.edit"), FILES_DELETE("files.delete"),
	FILES_INFO(FilesInfoResponse.class, "files.info"), FILES_LIST(FilesListResponse.class, "files.list"), FILES_UPLOAD(FilesResponse.class, "files.upload"),
	GROUPS_CLOSE(CloseResponse.class, "groups.close"), GROUPS_HISTORY(HistoryResponse.class, "groups.history"), GROUPS_INFO(GroupInfoResponse.class, "groups.info"), 
	GROUPS_LIST(GroupsListResponse.class, "group.info"), GROUPS_OPEN(OpenResponse.class, "groups.open"), GROUPS_SET_PURPOSE(SetPurposeResponse.class, "groups.setPurpose"),
	GROUPS_SET_TOPIC(SetTopicResponse.class, "groups.setTopic"), IM_CLOSE(CloseResponse.class, "im.close"), IM_HISTORY(HistoryResponse.class, "im.history"),
	IM_LIST(ImListResponse.class, "im.list"), IM_OPEN(ImOpenResponse.class, "im.open"), MPIM_CLOSE(CloseResponse.class, "mpim.close"),
	MPIM_HISTORY(HistoryResponse.class, "mpim.history"), MPIM_LIST(GroupsListResponse.class, "mpim.list"), MPIM_OPEN(MpimOpenResponse.class, "mpim.open"),
	PINS_ADD("pins.add"), PINS_LIST(ItemListResponse.class, "pins.list"), PINS_REMOVE("pins.remove"), REACTIONS_ADD("reactions.add"), REACTIONS_LIST(ItemListResponse.class, "reactions.list"),
	REACTIONS_REMOVE("reactions.remove"), STARS_ADD("stars.add"), STARS_REMOVE("stars.remove"), TEAM_INFO(TeamInfoResponse.class, "team.info"),
	USERS_GET_PRESENCE(UsersGetPresenceResponse.class, "users.getPresence"), USERS_INFO(UsersInfoResponse.class, "users.info"),
	USERS_LIST(UsersListResponse.class, "users.list"), USERS_SET_PRESENCE("users.setPresence");
	
	private Class<?> responseClass;
	private String methodName;
	
	private ApiMethod(Class<?> value, String methodName) {
		this.responseClass = value;
		this.methodName = methodName;
	}
	
	private ApiMethod(String methodName) {
		this.responseClass = ApiResponse.class;
		this.methodName = methodName;
	}
	
	public Class<?> getResponseClass() {
		return responseClass;
	}
	
	public String getMethodname() {
		return methodName;
	}
}	