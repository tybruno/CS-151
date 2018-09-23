
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaysSinceBorn {
    public static long daysSinceBorn(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanoSecond, ZoneId zone)
    {
        ZonedDateTime dayBorn = ZonedDateTime.of(year,month,dayOfMonth,hour,minute,second,nanoSecond,zone);
        long daysSinceBorn = dayBorn.until(ZonedDateTime.now(), ChronoUnit.DAYS);

        return daysSinceBorn;
    }

    public static void main(String[] args){

        ZoneId usCentral = ZoneId.of("America/Chicago");
        long days = daysSinceBorn(1992,8,2,1,1,20,40,usCentral);

        System.out.println(days);



    }
}
