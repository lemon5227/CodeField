package 实验一06;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("林志玲", 27));
        hashSet.add(new Student("王祖贤", 21));
        hashSet.add(new Student("张曼玉", 25));
        hashSet.add(new Student("关之琳", 29));
        hashSet.add(new Student("林志玲", 27));
        hashSet.add(new Student("林志玲", 20));

        for(Student s:hashSet){
            System.out.println(s.toString());
        }

    }
}
