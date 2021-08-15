import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.Node;

import java.time.Period;

public class exp6 {
    public static void main(String[] args) {
        try {
            Person p = new Person("zhangsan",25);
        } catch (NoAgeException e) {
            e.printStackTrace();
        }finally {
            System.out.println("over");
        }


    }

}
class NoAgeException extends Exception {
    String message;
    NoAgeException(){

    }
    NoAgeException(String message){
        this.message=message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

class Person {
    private String name;
    private int age;
    Person(String name,int age) throws NoAgeException {
        this.age=age;
        this.name=name;
        if(age < 0 || age>200){
            throw new NoAgeException(age+",年龄数值非法");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}