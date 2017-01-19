package me.ramswaroop.jbot.core.slack.apiresponses;

public enum ApiMethod {
	//Enums with no parameters represent methods that return no special parameters
	API_TEST(ApiTestResponse.class), AUTH_TEST(AuthTestResponse.class), AUTH_REVOKE(AuthRevokeResponse.class),
	CHANNELS_HISTORY(HistoryResponse.class), CHANNELS_INFO(ChannelsInfoResponse.class),
	CHANNELS_LIST(ChannelsListResponse.class), CHANNELS_SET_PURPOSE(SetPurposeResponse.class), 
	CHANNELS_SET_TOPIC(SetTopicResponse.class), CHAT_DELETE(ChatResponse.class), CHAT_ME_MESSAGE(ChatResponse.class),
	CHAT_POST_MESSAGE(ChatMessageResponse.class), CHAT_UPDATE(ChatMessageResponse.class),
	DND_INFO(DndInfoResponse.class), EMOJI_LIST(EmojiListResponse.class), FILES_COMMENTS_ADD(FilesCommentsResponse.class),
	FILES_COMMENTS_DELETE, FILES_COMMENTS_EDIT(FilesCommentsResponse.class), FILES_DELETE,
	FILES_INFO(FilesInfoResponse.class), FILES_LIST(FilesListResponse.class), FILES_UPLOAD(FilesResponse.class),
	GROUPS_CLOSE(CloseResponse.class), GROUPS_HISTORY(HistoryResponse.class), GROUPS_INFO(GroupInfoResponse.class), 
	GROUPS_LIST(GroupsListResponse.class), GROUPS_OPEN(OpenResponse.class), GROUPS_SET_PURPOSE(SetPurposeResponse.class),
	GROUPS_SET_TOPIC(SetTopicResponse.class), IM_CLOSE(CloseResponse.class), IM_HISTORY(HistoryResponse.class),
	IM_LIST(ImListResponse.class), IM_OPEN(ImOpenResponse.class), MPIM_CLOSE(CloseResponse.class),
	MPIM_HISTORY(HistoryResponse.class), MPIM_LIST(GroupsListResponse.class), MPIM_OPEN(MpimOpenResponse.class),
	PINS_ADD, PINS_LIST(ItemListResponse.class), PINS_REMOVE, REACTIONS_ADD, REACTIONS_LIST(ItemListResponse.class),
	REACTIONS_REMOVE, STARS_ADD, STARS_REMOVE, TEAM_INFO(TeamInfoResponse.class),
	USERS_GET_PRESENCE(UsersGetPresenceResponse.class), USERS_INFO(UsersInfoResponse.class),
	USERS_LIST(UsersListResponse.class), USERS_SET_PRESENCE;
	
	private Class<?> responseClass;
	
	private ApiMethod(Class<?> value) {
		this.responseClass = value;
	}
	
	private ApiMethod() {
		this.responseClass = ApiResponse.class;
	}
	
	public Class<?> getResponseClass() {
		return responseClass;
	}
}	