package OOP;
//this调用构造器
//可以通过this(形参列表)来显式的调用其他构造器
//不能同this（形参列表）调用自己
//
public class This_231 {
    public static void main(String[] args) {

    }
}
class Person{
    int age;
    String name;

    public Person(){
        //40行代码
    }
    public Person(int n){
        this();//可以通过调用上面那个构造器来省略40行代码
    }
}