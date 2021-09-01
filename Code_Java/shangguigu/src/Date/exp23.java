package Date;

import java.time.*;

public class exp23 {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println("Now time :"+clock.instant());
        System.out.println("Now time millis:"+clock.millis());

        Duration d = Duration.ofDays(1);
        System.out.println("a day = "+d.toHours()+"hours");
        System.out.println("a day ="+d.toMinutes()+"minutes");
        System.out.println("a day ="+d.getSeconds()+"seconds");

        Instant instant = Instant.now();
        System.out.println("Now time :"+instant);
        System.out.println("after a hour time :"+instant.plusSeconds(3600));
        System.out.println("Before a hour time :"+instant.minusSeconds(3600));

        LocalDate localdate = LocalDate.now();
        System.out.println("Now Ä¬ÈÏ date :"+localdate);


        LocalTime localTime = LocalTime.now();
        System.out.println("Now Ä¬ÈÏ time: "+localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Now Ä¬ÈÏ date time£º"+localDateTime);
        LocalDateTime  times = localDateTime.plusDays(1).plusHours(3).plusMinutes(30);
        System.out.println("after 1:30:30 time:"+times);

        Year year = Year.now();
        System.out.println("Now year:"+year);
        YearMonth yearMonth = YearMonth.now();
        System.out.println("Now year month:"+yearMonth);
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Time area:"+zoneId);
    }
}
