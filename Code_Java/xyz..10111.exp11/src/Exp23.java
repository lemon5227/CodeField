import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Exp23 {
    public static void main(String[] args) {
        //clock的使用
        Clock clock = Clock.systemUTC();
        System.out.println("获取UTC时区转换的当前时间"+clock.instant());
        System.out.println("获取UTC时区转换的毫秒数"+clock.millis());
        //2.Duration的使用
        Duration d = Duration.ofDays(1);
        System.out.println("一天等于"+d.toHours()+"小时");
        System.out.println("一天等于"+d.toMinutes()+"分钟");
        System.out.println("一天等于"+d.toMillis()+"秒");
        //3.Instant 的使用
        Instant instant = Instant.now();
        System.out.println("获取UTC时区的当前时间为："+instant);
    }
}
