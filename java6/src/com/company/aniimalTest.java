package com.company;

public class aniimalTest {
    public static void main(String[] args) {
        animal a1= new animal();
        a1.setLegs(4);
        a1.name="doge";
        a1.show();
    }
}
class animal{
    String name;
    private int legs;
    public void eat(){
        System.out.println("eat the food!");
    }
    public void show(){
        System.out.println("name="+name+" "+"legs="+legs);
    }
    public void setLegs(int l){
        if(l >=0 && l%2==0){
            legs=l;
        }else {
            legs=0;
            //Å×³öÒì³£
        }
    }
    public void getLegs(){

    }
}