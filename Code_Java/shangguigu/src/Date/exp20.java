package Date;

import java.util.Calendar;

public class exp20 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int date = calendar.get(Calendar.DATE);
        System.out.println(year + " "+month+" "+date);
    }
}
