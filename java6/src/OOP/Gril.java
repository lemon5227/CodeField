package OOP;

public class Gril {
    private String name;
    private int age;

    public Gril(){

    }
    public Gril(int n,String name){

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

    public void marry(Boy boy){
        System.out.println("I want to marry "+boy.getName());
        boy.marry(this);
    }
    public int cmp(Gril gril){
        return this.age- gril.age;
    }
}
