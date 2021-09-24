package BlockTest;

/**
 * 类的成员之代码块
 * 1.代码块的作业：初始化类、对象
 * 2.只能用static修饰
 * 3.静态代码块 VS 非静态代码块
 * 4.静态代码块
 *      >可以写输出语句
 *      >随着类的加载而执行，而且只执行一次
 *      >定义多个静态代码块按声明顺序执行
 *      >静态代码块只能调用静态的属性、静态的方法，不能调用非静态的结构
 * 5.非静态代码块
 *      >可以写输出语句
 *      >随着对象的创建而执行，每创建一个对象就执行一次
 *      >作用：在创建对象时，对对象等属性进行初始化
 *      >定义多个静态代码块按声明顺序执行
 *      >非静态代码块可以调用静态的属性、静态的方法、或非静态的属性、非静态的方法
 */

public class BolckTest {
    public static void main(String[] args) {
        String desc = Person.desc;
        System.out.println(desc);
        Person p1 = new Person();
    }
}

class Person{
    String name;
    int age;
    static String desc = "i am chinese";

    public Person(){

    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }


    static {
        System.out.println("hello,static block");
        desc = "I am a like to study man";
    }

    {
        System.out.println("hello,block");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat(){
        System.out.println("吃饭！");
    }
    public void info(){
        System.out.println("i am a happy man");
    }
}