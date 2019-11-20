package league_objects.match;

import league_objects.match.participant.ParticipantDto;
import org.json.JSONException;
import org.json.JSONObject;

public class MatchDto {

    private int seasonId, queueId, mapId;
    private long gameId, gameDuration, gameCreation;
    private String platformId, gameType, gameMode, gameVersion;
    private ParticipantDto[] participantIdentities;
    private TeamStatsDto[] teams;
    private ParticipantDto[] participants;

    public MatchDto(JSONObject match) throws JSONException {
        this.seasonId = match.getInt("seasonID");
        this.queueId = match.getInt("queueId");
        this.mapId = match.getInt("mapId");
        this.gameId = match.getLong("gameId");
        this.gameDuration = match.getLong("gameDuration");
        this.gameCreation = match.getLong("gameCreation");
        this.platformId = match.getString("platformId");
        this.gameType = match.getString("gameType");
        this.gameMode = match.getString("gameMode");
        this.gameVersion = match.getString("gameVersion");
    }

    @Override
    public String toString() {
        return "MatchDto{" +
                "seasonId=" + seasonId +
                ", queueId=" + queueId +
                ", mapId=" + mapId +
                ", gameId=" + gameId +
                ", gameDuration=" + gameDuration +
                ", gameCreation=" + gameCreation +
                ", platformId='" + platformId + '\'' +
                ", gameType='" + gameType + '\'' +
                ", gameMode='" + gameMode + '\'' +
                ", gameVersion='" + gameVersion + '\'' +
                '}';
    }
}
