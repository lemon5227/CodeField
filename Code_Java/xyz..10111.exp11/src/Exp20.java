import java.util.Calendar;

public class Exp20 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        //�·ݴ�0��ʼ
        int month = calendar.get(Calendar.MONTH)+1;
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("��ǰʱ�䣺"+year+"��"+month+"��"+date+"��"+hour+"ʱ"+minute+"��"+second+"��");
    }
}
