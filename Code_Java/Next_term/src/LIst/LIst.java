package LIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * ����Ԫ�ر�����5�ַ�ʽ
 * 1.��ͨforѭ�����List�ӿڵ�size()��get(index i)����
 * 2.ʹ��Iterator����������
 * ��������
 *      a:ͨ�����϶����ȡ����������
 *      b:ͨ�������������hasNext()�����ж���û��Ԫ��
 *      c:ͨ�������������next����������ȡԪ�ز��ƶ�����һ��Ԫ��λ��
 *  3.��ǿfor
 */
public class LIst {
    public static void main(String[] args) {
        List list = new ArrayList();

        //List�ӿڵĵײ�ʵ�������飬��һ�ֱ䳤�����顣

        list.add("hello");
        list.add("java");
        list.add("world");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            System.out.println(str);
        }
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            System.out.println(str);
        }

        /**
         * ��ǿfor:��forѭ����һ�֣��������ǵ�����
         * ��ʽ��
         *      for��Ԫ���������� ���� �������collection���ϣ�{
         *          ʹ�ñ������ɣ��ñ�������Ԫ��
         *      }
         */

        System.out.println("---��ǿfor---");
        for (Object o : list) {
            String s = (String) o;
            System.out.println(s);
        }
    }
}
