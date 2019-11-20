package handler;

import api.request;
import league_objects.MatchlistDto;

public class MatchlistHandler {
    private String url;


    public MatchlistHandler(String region) {
        this.url = "https://" + region + ".api.riotgames.com/lol/match/v4/matchlists/by-account/";
    }

    public MatchlistDto get_match_list_by_encrypted_account_id(String id, String x_riot_token) throws Exception {
        request req = new request(x_riot_token);
        String url = this.url + id;
        return new MatchlistDto(req.send(url));
    }

}
