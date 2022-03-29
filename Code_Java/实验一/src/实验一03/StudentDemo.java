package 实验一03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 闫文博
 */
public class StudentDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("王伦",21));
        list.add(new Student("王苑",18));
        list.add(new Student("程宇",20));
        list.add(new Student("毕胜",22));
        list.add(new Student("张雪",19));
        Iterator it= list.iterator();
        while (it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.toString());
        }
    }

}
