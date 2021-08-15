import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        // 第一阶段
        int a = 10;
        int b = 0;
        if(b!=0) {
            //用if语句修改了此处代码
            System.out.println(a / b);
        }
        //编译期异常
        String s="2021-5-26";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date date=sdf.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("日期解析异常");
        }

        // 第二阶段
        System.out.println("over");
    }
}