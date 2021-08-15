package com.company;

public class Person {
    private int Age;
    private String name;
    public Person(){
        Age=18;
    }
    public void setAge(int a){
        if(a<0 || a>130){
            throw new RuntimeException("传入数据非法");
        }else {
            Age=a;
        }
    }
    public int getAge(){
        return Age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.println("eating");
    }
}
