import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("����������������");
        try {
            methoed();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        method2();
        System.out.println("��ϧ�����е��Ȱ�");
    }
    // �������쳣���׳�
    private static void method2() throws ArithmeticException{
        int a=10;
        int b=0;
        System.out.println(a/b);
    }
    // �������쳣���׳�
    // �ڷ����������׳�����Ϊ�˸��ߵ����ߣ���ע���ˣ��������⡣
    private static void methoed() throws ParseException {
        String s = "2021-5-31";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:ss:mm");
        Date date = sdf.parse(s);
        System.out.println(date);
    }
}