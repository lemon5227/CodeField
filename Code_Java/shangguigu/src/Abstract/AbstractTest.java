package Abstract;

/**
 * Abstract�ؼ��ֵ�ʹ��
 * 1.abstract�������
 * 2.�����������εĽṹ�����ࡢ������
 * 3.abstract�����ࣺ������
 *          >���಻��ʵ����
 *          >��������һ���й���������������ʵ����ʱ����
 *          >�����У������ṩ����������࣬�����������ز���
 * 4.abstract���η����� ���󷽷�
 *          >���󷽷�ֻ�з���������û�з�����
 *          >�������󷽷����࣬һ���Ǹ������ࡣ��֮���������п���û�г��󷽷�
 *          >��������д�˸�������Գ��󷽷��󣬴����෽��ʵ����
 *          ��û����д���Գ��󷽷����Ǵ��໹�ǳ����໹����Ҫ����abstract
 */

/**
 *  abstractʹ���ϵ�ע��㣺
 *  1.abstract�����������Σ� ���ԡ��������Ƚṹ
 *
 *  2.abstract������������˽�з�������̬������final������final����
 */

public class AbstractTest {
    public static void main(String[] args) {
        //���󻯺���ʵ����
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
        System.out.println("�˳Է�");
    }

    public void walk(){
        System.out.println("����·");
    }

}

class Student extends Person{

}
