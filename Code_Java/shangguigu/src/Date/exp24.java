package Date;

import java.text.DateFormat;
import java.util.Date;

public class exp24 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
        //medium格式的日期/时间格式化对象
        DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        //short格式的日期/时间格式化对象
        DateFormat shortFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        //打印格式化后的
        System.out.println("原型"+dateFormat.format(date));
        System.out.println("完整格式时间："+fullFormat.format(date));
        System.out.println("长格式"+longFormat.format(date));
        System.out.println("普通格式"+mediumFormat.format(date));
        System.out.println("短格式"+shortFormat.format(date));

    }
}
