package corso.chuckNorrisFact;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Random;

import org.json.simple.parser.JSONParser;

public class ChuckNorrisFact {

	private String baseUrl;
	private String content;
	JSONParser parser = new JSONParser();

	public String getBaseUrl() { // TESTED
		return baseUrl;
	}
	
	public ChuckNorrisFact() {
		this.baseUrl = "http://api.icndb.com/jokes/";
	}

	public void setBaseUrl(String baseUrl) { // TESTED
		this.baseUrl = baseUrl;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String concatUrl(String id) { // TESTED
		return getBaseUrl() + id;
	}

	public String getJokefromJson(String jsonContent) {
		final String TOKEN = "\"joke\": \"";
		int startIndex = jsonContent.indexOf(TOKEN);
		if (startIndex < 0)
			return "";

		String joke = jsonContent.substring(startIndex + TOKEN.length());

		int endIndex = joke.indexOf("\"");
		joke = joke.substring(0, endIndex);
		joke = joke.replace("&quot;", "\"");
		return joke;
	}

	public String getUrlContent() {
		String urlContent = "";

		try {
			URL document = new URL(concatUrl(randomId())); // Reads the URL
			BufferedReader reader = new BufferedReader( // Puts the Stream into Reader
					new InputStreamReader // Opens the Stream
					(document.openStream())); // openStream converts a String to a Stream
			// This is a high power operation for our webapp
			String inputLine = "";
			while ((inputLine = reader.readLine()) != null) {
				urlContent += inputLine;
			}
			reader.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return urlContent;
	}

	
	public String randomId() {

		Random rand = new Random();

		// Obtain a number between [0 - 49].
		int n = rand.nextInt(999)+1;

		return String.valueOf(n);
	}

	

}

