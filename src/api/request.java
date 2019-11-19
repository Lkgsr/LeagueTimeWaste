package api;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class request {

    private String origin, accept_charset, x_riot_token, accept_language;

    public request(String origin, String accept_charset, String x_riot_token, String accept_language) {
        this.origin = origin;
        this.accept_charset = accept_charset;
        this.x_riot_token = x_riot_token;
        this.accept_language = accept_language;
    }

    public request(String x_riot_token) {
        this.x_riot_token = x_riot_token;
        this.origin = "https://developer.riotgames.com";
        this.accept_charset = "application/x-www-form-urlencoded; charset=UTF-8";
        this.accept_language = "de,en-US;q=0.7,en;q=0.3";
    }


    public JSONObject send(String url) throws Exception {
        String inputLine;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("Origin", this.origin);
        con.setRequestProperty("Accept-Charset", this.accept_charset);
        con.setRequestProperty("X-Riot-Token", this.x_riot_token);
        con.setRequestProperty("Accept-Language", this.accept_language);

        // Send and read request

        int responseCode = con.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return new JSONObject(response.toString());

    }
}