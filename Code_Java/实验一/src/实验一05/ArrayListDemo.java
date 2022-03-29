package 实验一05;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> smallArray = new ArrayList<>();
        smallArray.add(new Student("貂蝉",19));
        smallArray.add(new Student("大乔",23));
        smallArray.add(new Student("小乔",18));
        smallArray.add(new Student("孙尚香",26));

        ArrayList<Student> smallArray2 = new ArrayList<>();
        smallArray2.add(new Student("孙二娘", 25));
        smallArray2.add(new Student("扈三娘", 27));
        smallArray2.add(new Student("李师师", 17));
        smallArray2.add(new Student("阎婆惜", 36));

        ArrayList<Student> smallArray3 = new ArrayList<>();
        smallArray3.add(new Student("林黛玉", 19));
        smallArray3.add(new Student("王熙凤", 35));
        smallArray3.add(new Student("薛宝钗", 20));
        smallArray3.add(new Student("袭人", 21));

        System.out.println("--------增强for方法-----");
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
        System.out.println("----------forEach方法------------");
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
