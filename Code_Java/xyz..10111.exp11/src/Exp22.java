import java.util.Calendar;

public class Exp22 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH,13);
        System.out.println(calendar.getTime());
        //����non-lenient ģʽ
        calendar.setLenient(false);
        calendar.set(Calendar.MONTH,13);
        System.out.println(calendar.getTime());
    }
}
