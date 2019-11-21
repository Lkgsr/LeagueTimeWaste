import java.time.Instant;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class tools {


    public DateTime convert_timestamp_to_etc_date(long timestamp){

        return new DateTime((timestamp), DateTimeZone.forID( "Europe/Paris" ) );

    }


}
