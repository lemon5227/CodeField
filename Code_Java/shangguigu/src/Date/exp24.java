package Date;

import java.text.DateFormat;
import java.util.Date;

public class exp24 {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        DateFormat fullFormat = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat longFormat = DateFormat.getDateInstance(DateFormat.LONG);
        //medium��ʽ������/ʱ���ʽ������
        DateFormat mediumFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        //short��ʽ������/ʱ���ʽ������
        DateFormat shortFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        //��ӡ��ʽ�����
        System.out.println("ԭ��"+dateFormat.format(date));
        System.out.println("������ʽʱ�䣺"+fullFormat.format(date));
        System.out.println("����ʽ"+longFormat.format(date));
        System.out.println("��ͨ��ʽ"+mediumFormat.format(date));
        System.out.println("�̸�ʽ"+shortFormat.format(date));

    }
}
