package consistent4444.dealingwithnetworkdata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/**
 * Created by x085271 on 10/21/2017.
 */

public class NetworkUtils {
    static StringBuffer stringBuffer=new StringBuffer();
    public static URL createURL(String URL) throws MalformedURLException {
        URL url = new URL(URL);
        return url;

    }
    public static String getJsonResponse(URL url) throws IOException {
        HttpURLConnection urlConnection= null;
        try {
            urlConnection = (HttpURLConnection)url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        urlConnection.setRequestMethod("GET");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String readLine;
        while((readLine=bufferedReader.readLine())!=null){
            stringBuffer.append(readLine);

        }
        return stringBuffer.toString();

    }
}
