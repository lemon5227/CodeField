import java.time.Period;
import java.util.Scanner;

public class exp7 {
    public static void main(String[] args) {
        int age;
        Person1 p1 = new Person1();
        System.out.println("请输入年龄");
        Scanner in = new Scanner(System.in);
        age = in.nextInt();
        p1.setAge(age);
    }

}
class AgeException extends Exception{
    AgeException(){
        System.out.println("年龄应在18—60之间");
    }
}

 class Person1{
    private int age;
    Person1(){

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age <18 || age>60){
            try {
                throw new AgeException();
            } catch (AgeException e) {
                e.printStackTrace();
            }
        }
    }
}