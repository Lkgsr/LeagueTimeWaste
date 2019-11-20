import handler.MatchlistHandler;
import handler.SummonerHandler;
import league_objects.Summoner;
import league_objects.match.MatchlistDto;

public class debug {
    public static void main(String[] args) {
        SummonerHandler sum = new SummonerHandler("euw1");
        MatchlistHandler m = new MatchlistHandler("euw1");
        try {
            Summoner summoner = sum.get_summoner_by_summoner_name("SaItySurprise", private_variable.x_riot_token);
            System.out.println(summoner.toString());
            MatchlistDto match_list = m.get_match_list_by_encrypted_account_id(summoner.getAccountId(), private_variable.x_riot_token);
            System.out.println(match_list.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
