package test06;

public class Musician {
    private String name;

    public Musician(String name) {
        this.name = name;
    }
    public Musician(){

    }
    public void play(Instrument i){
        i.makeSound(name);
    }
}
