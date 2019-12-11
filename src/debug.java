import handler.MatchHandler;
import handler.MatchlistHandler;
import handler.SummonerHandler;
import league_objects.Summoner;
import league_objects.match.MatchDto;
import league_objects.match.MatchReferenceDto;
import league_objects.match.MatchlistDto;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class debug {
    public static void main(String[] args) {
        SummonerHandler sum = new SummonerHandler("euw1");
        MatchlistHandler m_ref = new MatchlistHandler("euw1");
        MatchHandler m = new MatchHandler("euw1");
        tools t = new tools();
        try {
            Summoner summoner = sum.get_summoner_by_summoner_name("Zäser", private_variable.x_riot_token);
            System.out.println(summoner.toString());
            MatchlistDto match_list = m_ref.get_match_list_by_encrypted_account_id(summoner.getAccountId(), private_variable.x_riot_token);
            System.out.println(match_list.toString());
            double time = 0;
            long longest_timestamp = 0;
            long shortest_timestamp = Long.MAX_VALUE;
            for (MatchReferenceDto match_ref: match_list.getMatches()) {
                MatchDto match = m.get_match_by_match_id(match_ref.getGameId(), private_variable.x_riot_token);
                if (match.getGameCreation() < shortest_timestamp){
                    shortest_timestamp = match.getGameCreation();
                }
                if (match.getGameCreation() > longest_timestamp){
                    longest_timestamp = match.getGameCreation();
                }
                System.out.println(t.convert_timestamp_to_etc_date(match.getGameCreation()).toDate());
                time += match.getGameDuration();
                Thread.sleep(1000);
            }
            DateTime dt1 = t.convert_timestamp_to_etc_date(longest_timestamp).toDateTime();
            DateTime dt2 = t.convert_timestamp_to_etc_date(shortest_timestamp).toDateTime();
            System.out.println(time);
            System.out.println("days between " + dt2.toDate() + " --- " + dt1.toDate() + " are " + Days.daysBetween(dt2, dt1).getDays());
            System.out.println("days played in this time " + ((time / 60) / 60));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
