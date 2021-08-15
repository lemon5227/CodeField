package Abstract;

/**
 * Abstract关键字的使用
 * 1.abstract：抽象的
 * 2.可以用来修饰的结构：；类、方法；
 * 3.abstract修饰类：抽象类
 *          >此类不能实例化
 *          >抽象类中一定有构造器，便于子类实例化时调用
 *          >开发中，都会提供抽象类的子类，让子类完成相关操作
 * 4.abstract修饰方法： 抽象方法
 *          >抽象方法只有方法声明，没有方法体
 *          >包含抽象方法的类，一定是个抽象类。反之，抽象类中可是没有抽象方法
 *          >若子类重写了父类的所以抽象方法后，此子类方可实例化
 *          若没有重写所以抽象方法，那此类还是抽象类还是需要加上abstract
 */

/**
 *  abstract使用上的注意点：
 *  1.abstract不能用来修饰： 属性、构造器等结构
 *
 *  2.abstract不能用来修饰私有方法、静态方法、final方法、final的类
 */

public class AbstractTest {
    public static void main(String[] args) {
        //抽象化后不能实例化
//        Person p1 = new Person();
//        p1.eat();
    }
}

abstract class Person{
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age){
        this.age=age;
        this.name=name;
    }
    public void eat(){
        System.out.println("人吃饭");
    }

    public void walk(){
        System.out.println("人走路");
    }

}

class Student extends Person{

}
