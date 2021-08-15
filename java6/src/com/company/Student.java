package com.company;

/**
 * @author ãÆÎÄ²©
 */
public class Student extends Person{
    String major;
    public Student(){

    }
    public Student(String name,int age,String major){
         super.setName(name);
         super.setAge(age);
         this.major=major;
    }
}
