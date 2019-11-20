package league_objects;

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
}
