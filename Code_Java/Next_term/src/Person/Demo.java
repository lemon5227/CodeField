package Person;

import java.util.GregorianCalendar;

public class Demo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("����",'��');
        Person p4 = new Person("XX",'Y');
        Person p3 = new Person("����",'Ů',new GregorianCalendar(1988,3,20));
        System.out.println(p1.toString());
        System.out.println(p4.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
