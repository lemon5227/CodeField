import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

 public class ExceptionDemo5 {
    public static void main(String[] args) {
        String s="2021-5-31";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("������������"); //�����1
        try {
            Date date=sdf.parse(s);  //�����2
            System.out.println(date);//�����3
        } catch (ParseException e) {
            e.printStackTrace(); //�����4
//			System.exit(0); 
            return;
        }finally{ //�����쳣�Ƿ�������������еĴ��붼��ִ�У�  �������ͷ���Դ���رմ򿪵��ļ���
            System.out.println("����Ĵ����Ǳ���ִ�е�");  //�����5
        }
        try{

        }finally{
            System.out.println("����Ĵ����Ǳ���ִ�е�");
        }
    }
}