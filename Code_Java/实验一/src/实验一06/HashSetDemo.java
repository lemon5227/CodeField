package ʵ��һ06;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("��־��", 27));
        hashSet.add(new Student("������", 21));
        hashSet.add(new Student("������", 25));
        hashSet.add(new Student("��֮��", 29));
        hashSet.add(new Student("��־��", 27));
        hashSet.add(new Student("��־��", 20));

        for(Student s:hashSet){
            System.out.println(s.toString());
        }

    }
}
