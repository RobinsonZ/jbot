package me.ramswaroop.jbot.core.slack;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import org.apache.http.client.utils.URIBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/** Contains static methods for accessing the Slack Web API.
 * @author Zachary Robinson
 */
public class SlackWebAPI {
	private static final Logger logger = LoggerFactory.getLogger(SlackWebAPI.class);
	
	@Value("${slackBotToken}")
	private static String token;
	//TODO: Handle bad params and errors from the API by throwing an exception
	//TODO: Catch 
	
	/** Makes a request to the Slack API with the defined method and params.
	 * @param method The Slack method to call.
	 * @param params A map containing the paremeters that make up the request.
	 * @return A Map containing the returned values as described by the Slack Web API method documentation.
	 * @throws IOException If there is an IO error between the client and API server.
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> makeApiRequest(String method, Map<String, String> params) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		URIBuilder requestBuilder = new URIBuilder()
				.setScheme("https")
				.setHost("slack.com")
				.setPath("/api/" + method);
		
		requestBuilder.addParameter("token", token);
		
		if (params != null) {
			for (Map.Entry<String, String> param : params.entrySet()) {
				requestBuilder.addParameter(param.getKey(), param.getValue());
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
		
		if (!Boolean.getBoolean(response.get("ok").toString())) {
			logger.error("Slack Web API returned error: " + response.get("error"));
		}
		
		return response;
	}
	
	/** Makes a request to the Slack Web API with the defined method and no params.
	 * @param method The method to be called
	 * @return A map containing the returned values as described in the Slack API documentation
	 * @throws IOException if there is an IO error between the client and server.
	 */
	public static Map<String, Object> makeApiRequest(String method) throws IOException {
		return makeApiRequest(method, null);
	}
}
