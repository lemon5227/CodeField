package สตั้าป07;

import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student ("linqingxia", 27));
        students.add(new Student ("zhangguorong", 29));
        students.add(new Student ("wanglihong", 23));
        students.add(new Student ("linqingxia", 27));
        students.add(new Student ("liushishi", 22));
        students.add(new Student ("wuqilong", 40));
        students.add(new Student ("gaoyuanyuan", 22));

        for(Student s:students){
            System.out.println(s.toString());
        }
    }
}
