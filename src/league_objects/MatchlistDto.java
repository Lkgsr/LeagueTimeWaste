package league_objects;

import java.util.ArrayList;

public class MatchlistDto {
    private ArrayList<MatchReferenceDto> matches;
    private int totalGames, startIndex, endIndex;


    public MatchlistDto(ArrayList<MatchReferenceDto> matches, int totalGames, int startIndex, int endIndex) {
        this.matches = matches;
        this.totalGames = totalGames;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public String toString() {
        return "MatchlistDto{" +
                "matches=" + matches +
                ", totalGames=" + totalGames +
                ", startIndex=" + startIndex +
                ", endIndex=" + endIndex +
                '}';
    }
}
