package handler;

import api.request;
import league_objects.Summoner;

public class SummonerHandler {

    private String url;

    public SummonerHandler(String region) {
        this.url = "https://" + region + ".api.riotgames.com/lol/summoner/v4/summoners/by-name/";
    }

    public Summoner get_summoner_by_summoner_name(String name, String x_riot_token) throws Exception {
        request req = new request(x_riot_token);
        String url = this.url + name;
        return new Summoner(req.send(url));
    }

}
