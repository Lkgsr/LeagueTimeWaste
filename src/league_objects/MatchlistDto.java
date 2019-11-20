package league_objects;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;

public class MatchlistDto {
    private MatchReferenceDto[] matches;
    private int totalGames, startIndex, endIndex;


    public MatchlistDto(MatchReferenceDto[] matches, int totalGames, int startIndex, int endIndex) {
        this.matches = matches;
        this.totalGames = totalGames;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public MatchlistDto(JSONObject match_list) throws JSONException {
        this.matches = matches_from_json_array(match_list.getJSONArray("matches"));
        this.totalGames = match_list.getInt("totalGames");
        this.startIndex = match_list.getInt("startIndex");
        this.endIndex = match_list.getInt("endIndex");
    }

    private MatchReferenceDto[] matches_from_json_array(JSONArray matches) throws JSONException {
        MatchReferenceDto[] match_list = new MatchReferenceDto[matches.length()];
        for (int i = 0; i < matches.length(); i++) {
            JSONObject json_match = matches.getJSONObject(i);
            match_list[i] =  new MatchReferenceDto(json_match);
        }
        return match_list;
    }

    @Override
    public String toString() {
        return "MatchlistDto{" +
                "matches=" + Arrays.toString(matches) +
                ", totalGames=" + totalGames +
                ", startIndex=" + startIndex +
                ", endIndex=" + endIndex +
                '}';
    }
}
