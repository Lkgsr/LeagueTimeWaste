package league_objects.match.participant;

import java.util.HashMap;

public class ParticipantTimelineDto {

    private String lane, role;
    private int participantId;
    private HashMap<String, Double> csDiffPerMinDeltas, goldPerMinDeltas, xpDiffPerMinDeltas, creepsPerMinDeltas,
            xpPerMinDeltas, damageTakenDiffPerMinDeltas, damageTakenPerMinDeltas;

}
