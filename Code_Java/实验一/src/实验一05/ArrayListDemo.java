package ʵ��һ05;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> smallArray = new ArrayList<>();
        smallArray.add(new Student("����",19));
        smallArray.add(new Student("����",23));
        smallArray.add(new Student("С��",18));
        smallArray.add(new Student("������",26));

        ArrayList<Student> smallArray2 = new ArrayList<>();
        smallArray2.add(new Student("�����", 25));
        smallArray2.add(new Student("������", 27));
        smallArray2.add(new Student("��ʦʦ", 17));
        smallArray2.add(new Student("����ϧ", 36));

        ArrayList<Student> smallArray3 = new ArrayList<>();
        smallArray3.add(new Student("������", 19));
        smallArray3.add(new Student("������", 35));
        smallArray3.add(new Student("Ѧ����", 20));
        smallArray3.add(new Student("Ϯ��", 21));

        System.out.println("--------��ǿfor����-----");
        ArrayList<ArrayList<Student>> bigArray = new ArrayList<>();
        bigArray.add(smallArray);
        bigArray.add(smallArray2);
        bigArray.add(smallArray3);

        for(ArrayList<Student> a:bigArray){
            for(Student s:a){
                System.out.println(s.toString());
            }
            System.out.println("---------------");
        }
        System.out.println("----------forEach����------------");
        bigArray.forEach(
                o->{
                    o.forEach(
                            s->{
                                System.out.println(s.toString());
                            }
                    );
                    System.out.println("---------------");
                }
        );

    }
}
