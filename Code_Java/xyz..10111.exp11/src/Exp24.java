import java.text.DateFormat;
import java.util.Date;

public class Exp24 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat mediumFormat = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat shortFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(fullFormat.format(date));
        System.out.println(longFormat.format(date));
        System.out.println(mediumFormat.format(date));
        System.out.println(shortFormat.format(date));
    }
}
