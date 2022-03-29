package สตั้าป08;

import java.util.Comparator;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.length()-o2.name.length();
            }
        });

        students.add(new Student ("linqingxia", 27));
        students.add(new Student ("zhangguorong", 29));
        students.add(new Student ("wanglihong", 23));
        students.add(new Student ("linqingxia", 27));
        students.add(new Student ("liushishi", 22));
        students.add(new Student ("wuqilong", 40));
        students.add(new Student ("gaoyuanyuan", 22));
        students.add(new Student("linqingxia", 29));

        for(Student s:students){
            System.out.println(s.toString());
        }
    }
}
