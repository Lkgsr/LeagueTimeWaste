package league_objects;

import org.json.JSONException;
import org.json.JSONObject;

public class Summoner {

    private int profileIconId;
    private String name, puuid, id, accountId;
    private long summonerLevel, revisionDate;

    public Summoner(int profileIconId, String name, String puuid, String id, String accountId, long summonerLevel, long revisionDate) {
        this.profileIconId = profileIconId;
        this.name = name;
        this.puuid = puuid;
        this.id = id;
        this.accountId = accountId;
        this.summonerLevel = summonerLevel;
        this.revisionDate = revisionDate;
    }

    public Summoner(JSONObject summoner) throws JSONException {
        this.profileIconId = summoner.getInt("profileIconId");
        this.name = summoner.getString("name");
        this.puuid = summoner.getString("puuid");
        this.id = summoner.getString("id");
        this.accountId = summoner.getString("accountId");
        this.summonerLevel = summoner.getLong("summonerLevel");
        this.revisionDate = summoner.getLong("revisionDate");
    }

    @Override
    public String toString() {
        return "Summoner{" +
                "profileIconId=" + profileIconId +
                ", name='" + name + '\'' +
                ", puuid='" + puuid + '\'' +
                ", id='" + id + '\'' +
                ", accountId='" + accountId + '\'' +
                ", summonerLevel=" + summonerLevel +
                ", revisionDate=" + revisionDate +
                '}';
    }

}
