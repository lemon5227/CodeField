package com.company;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.setAge(10);
        int n=p1.getAge();
        System.out.println("age = "+n);
    }
}
