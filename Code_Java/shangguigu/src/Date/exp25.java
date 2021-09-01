package Date;

import java.text.*;
import java.util.Date;

public class exp25 {
    public static void main(String[] args) throws ParseException {
        DateFormat dt1 = DateFormat.getDateInstance();
        DateFormat dt2 = DateFormat.getDateInstance(DateFormat.LONG);
        String str1 = "2021-9-1";
        String str2 = "2021Äê9ÔÂ1ÈÕ";
        System.out.println(dt1.parse(str1));
        System.out.println(dt2.parse(str2));
    }
}
