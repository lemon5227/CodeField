package Person;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    private String name;
    private char sex;
    private GregorianCalendar birthday;

    public Person() {
        this("XX",'Y',new GregorianCalendar(1970,0,1));
    }

    public Person(String name, char sex) {
        this(name,sex,new GregorianCalendar(1970,0,1));
    }

    public Person(String name, char sex, GregorianCalendar birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public GregorianCalendar getBirthday() {
        return birthday;
    }

    public void setBirthday(GregorianCalendar birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "姓名：" + name + "\t性别：" + sex + "\t生日：" + String.format("%tY年%<tm月%<td日",birthday);
    }
}
