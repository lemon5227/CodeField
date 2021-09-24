package LIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    /**
     * �б��������
     *      ListIterator listIterator():List�������еĵ�����
     *      �õ������̳���Iterator�����������ԾͿ���ֱ��ʹ��hasNext��Next()����
     *
     * ���й��ܣ�
     *      Object previous():��ȡ��һ��Ԫ��
     *      Boolean hasPrevious():�ж��Ƿ���Ԫ��
     *
     *      ע�⣺LIstIterator����ʵ��˫�����
     *      ���������������ListIterator listIterator(int index)
     */
    public static void main(String[] args) {
        List list = new ArrayList();

        //List�ӿڵĵײ�ʵ�������飬��һ�ֱ䳤�����顣

        list.add("hello");
        list.add("java");
        list.add("world");

        //�������

        ListIterator listIterator1 = list.listIterator(list.size());
        while (listIterator1.hasPrevious()){
            String str = (String) listIterator1.previous();
            System.out.println(str);
        }
        //�����޸��쳣
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            String str = (String) iterator.next();
//            if(str.equals("world")){
//                list.add("javaee");
//            }
//        }
        //�������������ڼ��ϴ��ڵģ����жϳɹ��󣬼������������Ԫ�أ���������ȴ��֪�������Ծͱ�����
        /**
         * ��ν����
         *  A������������Ԫ�أ��������޸�Ԫ��
         *  B����ͨforѭ������Ԫ�أ������޸�Ԫ��
         *          Ԫ����������
         */
        //����һ������������Ԫ�أ��������޸�Ԫ��
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            String str = (String) iterator.next();
            if(str.equals("world")){
                iterator.add("javaee");
            }
        }

        //����������ͨforѭ������Ԫ�أ������޸�Ԫ��
        for(int i=0;i< list.size();i++){
            String str = (String) list.get(i);
            if(str.equals("world")){
                list.add("javaee");
            }
        }

    }
}
