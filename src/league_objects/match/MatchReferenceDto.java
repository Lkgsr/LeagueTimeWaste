package league_objects.match;

import org.json.JSONException;
import org.json.JSONObject;

public class MatchReferenceDto {
    private String lane, platformId, role;
    private int champion, season, queue;
    private long gameId, timestamp;


    public MatchReferenceDto(String lane, String platformId, String role, int champion, int season, int queue, long gameId, long timestamp) {
        this.lane = lane;
        this.platformId = platformId;
        this.role = role;
        this.champion = champion;
        this.season = season;
        this.queue = queue;
        this.gameId = gameId;
        this.timestamp = timestamp;
    }

    public MatchReferenceDto(JSONObject match) throws JSONException {
        this.lane = match.getString("lane");
        this.platformId = match.getString("platformId");
        this.role = match.getString("role");
        this.champion = match.getInt("champion");
        this.season = match.getInt("season");
        this.queue = match.getInt("queue");
        this.gameId = match.getLong("gameId");
        this.timestamp = match.getLong("timestamp");
    }

    @Override
    public String toString() {
        return "MatchReferenceDto{" +
                "lane='" + lane + '\'' +
                ", platformId='" + platformId + '\'' +
                ", role='" + role + '\'' +
                ", champion=" + champion +
                ", season=" + season +
                ", queue=" + queue +
                ", gameId=" + gameId +
                ", timestamp=" + timestamp +
                '}';
    }

    public String getLane() {
        return lane;
    }

    public String getPlatformId() {
        return platformId;
    }

    public String getRole() {
        return role;
    }

    public int getChampion() {
        return champion;
    }

    public int getSeason() {
        return season;
    }

    public int getQueue() {
        return queue;
    }

    public long getGameId() {
        return gameId;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
