package OOP;

import javax.sound.midi.Soundbank;

public class Boy {
    private String name;
    private int age;
    public Boy(){

    }
    public Boy(int n,String name){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Gril gril){
        System.out.println("I want marry " + gril.getName());
    }
    public void shout(){
        if(this.age >= 22){
            System.out.println("You can !");
        }
        else {
            System.out.println("You cant,you just can date");
        }
    }
}
