package RandomNumbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.text.MessageFormat;

public class RandomNumberGenerator {

public RandomNumberGenerator(){
}

public String getRandomNumbers(int num, int min, int max) {
   return getUrlContent( generateRequestURL(num, min, max));
}

public String generateRequestURL(int num, int min, int max) {
    String result = MessageFormat.format("https://www.random.org/integers/?num={0}&min={1}&max={2}&col=1&base=10&format=plain&rnd=new", num, min,max);
    return result;       
}

public String getUrlContent(String urlString) {
    String urlContent = "";
    
    try {
        URL document = new URL(urlString); // Reads the URL
        BufferedReader reader = new BufferedReader( // Puts the Stream into Reader
                new InputStreamReader // Opens the Stream
                (document.openStream())); // openStream converts a String to a Stream
        // This is a high power operation for our webapp
        String inputLine = "";
        while ((inputLine = reader.readLine()) != null) {
            urlContent += inputLine;
            urlContent+= "\r\n";
        }
        reader.close();

    } catch (Exception e) {
        e.printStackTrace();
    }
    return urlContent;
}

}