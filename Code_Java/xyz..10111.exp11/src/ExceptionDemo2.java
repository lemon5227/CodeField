import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        // ��һ�׶�
        int a = 10;
        int b = 0;
        if(b!=0) {
            //��if����޸��˴˴�����
            System.out.println(a / b);
        }
        //�������쳣
        String s="2021-5-26";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            Date date=sdf.parse(s);
            System.out.println(date);
        } catch (ParseException e) {
            System.out.println("���ڽ����쳣");
        }

        // �ڶ��׶�
        System.out.println("over");
    }
}