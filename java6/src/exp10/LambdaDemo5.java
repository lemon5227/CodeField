package exp10;

@FunctionalInterface
interface PersonBuilder {
    Person buildPerson(String name);
}

//定义一个普通类PersonBuilderDemo
class PersonBuilderDemo {
    public void printName(String name, PersonBuilder pb) {
        Person p = pb.buildPerson(name);
        System.out.println(p.getName());
    }
}

//定义一个Person类，并添加有参构造方法
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

//定义测试类
public class LambdaDemo5 {

    public static void main(String[] args) {
        PersonBuilderDemo pbd = new PersonBuilderDemo();

        //使用匿名内部类方式
        PersonBuilder p1 = new PersonBuilder() {
            @Override
            public Person buildPerson(String name) {
                return new Person(name);
            }
        };
        pbd.printName("Z赵丽颖",p1);
        // 使用Lambda表达式方式
        pbd.printName("冯绍峰",(String name)->{
            return new Person(name);
        });

        //使用Lambda表达式省略格式
        pbd.printName("佟丽娅",(name -> new Person(name)));

        // 使用Lambda表达式的构造器引用方式



    }

}