package BlockTest;

/**
 * ��ĳ�Ա֮�����
 * 1.��������ҵ����ʼ���ࡢ����
 * 2.ֻ����static����
 * 3.��̬����� VS �Ǿ�̬�����
 * 4.��̬�����
 *      >����д������
 *      >������ļ��ض�ִ�У�����ִֻ��һ��
 *      >��������̬����鰴����˳��ִ��
 *      >��̬�����ֻ�ܵ��þ�̬�����ԡ���̬�ķ��������ܵ��÷Ǿ�̬�Ľṹ
 * 5.�Ǿ�̬�����
 *      >����д������
 *      >���Ŷ���Ĵ�����ִ�У�ÿ����һ�������ִ��һ��
 *      >���ã��ڴ�������ʱ���Զ�������Խ��г�ʼ��
 *      >��������̬����鰴����˳��ִ��
 *      >�Ǿ�̬�������Ե��þ�̬�����ԡ���̬�ķ�������Ǿ�̬�����ԡ��Ǿ�̬�ķ���
 */

public class BolckTest {
    public static void main(String[] args) {
        String desc = Person.desc;
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
        System.out.println("�Է���");
    }
    public void info(){
        System.out.println("i am a happy man");
    }
}