package Date;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class numformat {
    public static void main(String[] args) {
        int number = 5;
        double d = Math.PI;
        String s = "abcd";
        NumberFormat nf1 = new DecimalFormat("000");
        System.out.println(nf1.format(number));
        NumberFormat nf2 = new DecimalFormat("0.000");
        System.out.println(nf2.format(d));
        System.out.println(String.format("%03d%20.3f",number,d));
        //��ֵλ���û�Ƽ�������ÿ����λ��һ�����ţ�ÿ������Ҫ�������ţ�Ĭ���Ҷ��룬���Ҫ����룬�ӡ�-��
        System.out.println(String.format("%-20s%-,20d%+,20d",s,-12345678,123456789));
    }
}
