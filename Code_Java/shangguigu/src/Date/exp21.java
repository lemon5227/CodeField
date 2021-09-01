package Date;

import java.util.Calendar;

public class exp21 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,1,1);
        calendar.add(Calendar.DATE,100);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);

        System.out.println(year + " "+month+" "+date);
    }
}
