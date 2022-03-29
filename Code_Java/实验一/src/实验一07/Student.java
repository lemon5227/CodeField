package ʵ��һ07;

/**
 * @author ���Ĳ�
 */
public class Student implements Comparable<Student> {
    String name;
    int age;
    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return name + "   \t"+age;
    }


    @Override
    public int compareTo(Student o) {
        return this.age-o.age;
    }
}

