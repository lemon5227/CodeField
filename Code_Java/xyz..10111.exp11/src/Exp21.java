import java.util.Calendar;

public class Exp21 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018,1,1);
        calendar.add(Calendar.DATE,100);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int date = calendar.get(Calendar.DATE);
        System.out.println("计划竣工日期："+year+"年"+month+"月"+date+"日");
    }
}
