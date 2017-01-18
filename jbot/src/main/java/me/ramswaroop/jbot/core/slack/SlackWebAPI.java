package me.ramswaroop.jbot.core.slack;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import me.ramswaroop.jbot.core.slack.models.Bot;
import me.ramswaroop.jbot.core.slack.models.BotIcon;
import me.ramswaroop.jbot.core.slack.models.Channel;
import me.ramswaroop.jbot.core.slack.models.Error;

/** Contains static methods for accessing the Slack Web API.
 * @author Zachary Robinson
 */
public class SlackWebAPI {
	private static final Logger logger = LoggerFactory.getLogger(SlackWebAPI.class);
	
	@Value("${slackBotToken}")
	private static String token;
	//TODO: Handle bad params and errors from the API by throwing an exception
	//TODO: Write logging code for catch statements.
	
	/** Makes a request to the Slack API with the defined method and params.
	 * @param method The Slack method to call.
	 * @param params A map containing the paremeters that make up the request.
	 * @return A Map containing the returned values as described by the Slack Web API method documentation.
	 * @throws IOException If there is an IO error between the client and API server.
	 * @throws SlackErrorException If the slack API call returns an error.
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> makeApiRequest(String method, Map<String, Object> params) throws IOException, SlackErrorException {
		ObjectMapper mapper = new ObjectMapper();
		
		URIBuilder requestBuilder = new URIBuilder()
				.setScheme("https")
				.setHost("slack.com")
				.setPath("/api/" + method);
		
		requestBuilder.addParameter("token", token);
		
		if (params != null) {
			for (Map.Entry<String, Object> param : params.entrySet()) {
				requestBuilder.addParameter(param.getKey(), param.getValue().toString());
			}
		}
		
		URI requestURI;
		
		try {
			requestURI = requestBuilder.build();
		} catch (URISyntaxException e) { //No need to handle–syntax is hardcoded.
			requestURI = null; //This is just here to make the compiler happy
		}
		
		Map<String, Object> response = null;
		try {
			response = mapper.readValue(new URL(requestURI.toASCIIString()), Map.class);
		} catch (JsonParseException e) {
			// TODO write logging code
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO write logging code
			e.printStackTrace();
		}
		
		if (response != null && !Boolean.getBoolean(response.get("ok").toString())) {
			logger.error("Slack Web API returned error: " + response.get("error"));
			throw new SlackErrorException(new Error((String) response.get("error")));
		}
		
		return response;
	}
	
	/** Makes a request to the Slack Web API with the defined method and no params.
	 * @param method The method to be called
	 * @return A map containing the returned values as described in the Slack API documentation
	 * @throws IOException if there is an IO error between the client and server.
	 * @throws SlackErrorException 
	 */
	public static Map<String, Object> makeApiRequest(String method) throws IOException, SlackErrorException {
		return makeApiRequest(method, null);
	}
	
	//Specific API methods
	//TODO: Write documentation
	
	//auth.revoke
	
	public static Map<String, Object> revokeAuth() throws IOException, SlackErrorException {
		return makeApiRequest("auth.revoke");
	}

	public static Map<String, Object> testRevokeAuth() throws IOException, SlackErrorException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("test", "true");
		
		return makeApiRequest("auth.revoke", params);
	}
	
	//auth.test
	
	public static Map<String, Object> testAuth() throws IOException, SlackErrorException {
		return makeApiRequest("auth.test");
	}
	
	//bots.info
	
	@SuppressWarnings("unchecked")
	public static Bot getBotInfo() throws IOException, SlackErrorException {
		Map<String, Object> response = makeApiRequest("bots.info");
		
		Map<String, Object> bot = (Map<String, Object>) response.get("bot");
		
		return new Bot((String) bot.get("id"),
				(String) bot.get("name"),
				new BotIcon((String) bot.get("image_36"),
						(String) bot.get("image_48"),
						(String) bot.get("image_72")));
		
		
		
	}
	
	@SuppressWarnings("unchecked")
	public static Bot getBotInfo(String botID) throws IOException, SlackErrorException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("bot", botID);
		
		Map<String, Object> response = makeApiRequest("bots.info", params);
		
		Map<String, Object> bot = (Map<String, Object>) response.get("bot");
		
		return new Bot((String) bot.get("id"),
				(String) bot.get("name"),
				new BotIcon((String) bot.get("image_36"),
						(String) bot.get("image_48"),
						(String) bot.get("image_72")));
	}
	
	//channels.archive
	
	public static void archiveChannel(String channel) throws IOException, SlackErrorException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("channel", channel);
		
		makeApiRequest("channels.archive", params);
	}
	
	//channels.create
	
	@SuppressWarnings("unchecked")
	public static Channel createChannel(String name) throws IOException, SlackErrorException {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", name);
		
		Map<String, Object> response = makeApiRequest("channels.create", params);
		
		Map<String, Object> channel = (Map<String, Object>) response.get("channel");
		
		return null;
	}
	
	
}
