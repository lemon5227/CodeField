package exp10;

@FunctionalInterface
interface PersonBuilder {
    Person buildPerson(String name);
}

//����һ����ͨ��PersonBuilderDemo
class PersonBuilderDemo {
    public void printName(String name, PersonBuilder pb) {
        Person p = pb.buildPerson(name);
        System.out.println(p.getName());
    }
}

//����һ��Person�࣬������вι��췽��
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//���������
public class LambdaDemo5 {

    public static void main(String[] args) {
        PersonBuilderDemo pbd = new PersonBuilderDemo();

        //ʹ�������ڲ��෽ʽ
        PersonBuilder p1 = new PersonBuilder() {
            @Override
            public Person buildPerson(String name) {
                return new Person(name);
            }
        };
        pbd.printName("Z����ӱ",p1);
        // ʹ��Lambda���ʽ��ʽ
        pbd.printName("���ܷ�",(String name)->{
            return new Person(name);
        });

        //ʹ��Lambda���ʽʡ�Ը�ʽ
        pbd.printName("١���",(name -> new Person(name)));

        // ʹ��Lambda���ʽ�Ĺ��������÷�ʽ



    }

}