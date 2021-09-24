package LIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo {
    /**
     *  ����Ԫ�ر�����5�ַ�ʽ
     *  4.ʹ��jdk--forEach
     *      forEach(Consumer action)������JDK 8�������ӵı�������Ԫ�ط���
     *  ����Lambda���ʽ���ԣ��÷�������Ҫ�Ĳ�����һ������ʽ�ӿ�
     *      list.forEach(Object o)->{System.out.println("��������Ԫ��"+o)}
     *  lambda���ʽ��ʡ�Թ���
     *      1.���������ֻ��һ����������ô�������ͺ�С���Ŷ�����ʡ��
     *      2.����������ж����������ô�������Ϳ���ʡ��
     *      3.�����������ֻ��һ�д��룬��ô�����š�return���ֺŶ�����ʡ�ԣ����߱���һ��ʡ�ԣ�
     *  5.JDK 8�����Iterator�����������ṩ��һ��forEachRemaining(Consumer action)����������
     *  �÷���ͬ����Ҫһ������ʽ�ӿ�
     */
    public static void main(String[] args) {
        List list = new ArrayList();

        //List�ӿڵĵײ�ʵ�������飬��һ�ֱ䳤�����顣

        list.add("hello");
        list.add("java");
        list.add("world");

        //ԭʼ�������ڲ���ĸ�ʽ
        list.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                String s = (String) o;
                System.out.println(s);
            }
        });

        //������ʽ
        list.forEach((Object o)->{
            System.out.println(o);
        });

        //ʡ�Ը�ʽ
        list.forEach(o-> System.out.println(o));


        //forEachRemaining����
        Iterator iterator  = list.iterator();
        iterator.forEachRemaining(o-> System.out.println(o));
    }
}
