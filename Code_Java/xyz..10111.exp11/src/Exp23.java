import java.time.Clock;
import java.time.Duration;
import java.time.Instant;

public class Exp23 {
    public static void main(String[] args) {
        //clock��ʹ��
        Clock clock = Clock.systemUTC();
        System.out.println("��ȡUTCʱ��ת���ĵ�ǰʱ��"+clock.instant());
        System.out.println("��ȡUTCʱ��ת���ĺ�����"+clock.millis());
        //2.Duration��ʹ��
        Duration d = Duration.ofDays(1);
        System.out.println("һ�����"+d.toHours()+"Сʱ");
        System.out.println("һ�����"+d.toMinutes()+"����");
        System.out.println("һ�����"+d.toMillis()+"��");
        //3.Instant ��ʹ��
        Instant instant = Instant.now();
        System.out.println("��ȡUTCʱ���ĵ�ǰʱ��Ϊ��"+instant);
    }
}
