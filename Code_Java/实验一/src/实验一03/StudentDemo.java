package ʵ��һ03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author ���Ĳ�
 */
public class StudentDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("����",21));
        list.add(new Student("��Է",18));
        list.add(new Student("����",20));
        list.add(new Student("��ʤ",22));
        list.add(new Student("��ѩ",19));
        Iterator it= list.iterator();
        while (it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.toString());
        }
    }

}
