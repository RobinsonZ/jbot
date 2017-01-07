package me.ramswaroop.jbot.core.slack;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


/** Contains static methods for accessing the Slack Web API.
 * @author Zachary Robinson
 */
public class SlackWebAPI {
	
	@Value("${slackBotToken}")
	private static String token;
	//TODO: Handle bad params and errors from the API by throwing an exception
	//TODO: Catch 
	
	/** Makes a request to the Slack API with the defined method and params.
	 * @param method The Slack method to call.
	 * @param params A map containing the paremeters that make up the request.
	 * @return A map of the returned 
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, Object> makeApiRequest(String method, Map<String, String> params) {
		//TODO: Add logging
		ObjectMapper mapper = new ObjectMapper();
		
		URIBuilder requestBuilder = new URIBuilder()
				.setScheme("https")
				.setHost("slack.com")
				.setPath("/api/" + method);
		
		requestBuilder.addParameter("token", token);
		
		for (Map.Entry<String, String> param : params.entrySet()) {
			requestBuilder.addParameter(param.getKey(), param.getValue());
		}
		
		URI requestURI;
		try {
			requestURI = requestBuilder.build();
		} catch (URISyntaxException e) {
			requestURI = null;
			// TODO add some logging for this, though it shouldn't happen
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
		} catch (IOException e) {
			// TODO write logging code
			e.printStackTrace();
		}
		
		return response;
	}
}
