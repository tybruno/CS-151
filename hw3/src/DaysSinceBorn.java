
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Guestion 1 Prompt:
 * Write a program that computes the number of days that have elapsed since you were born. Use
 * the ZonedDateTime class, not the Day class of this chapter.
 */
public class DaysSinceBorn {
    /**
     * Calculates the days since a person was born
     * @param year the person was born
     * @param month the person was born
     * @param dayOfMonth the person was born
     * @param hour the person was born
     * @param minute the person was born
     * @param second the person was brn
     * @param nanoSecond the person was born
     * @param zone timezone that the person was born
     * @return the amount of days since the person was born
     */
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
