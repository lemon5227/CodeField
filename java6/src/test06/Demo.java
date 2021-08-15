package test06;

public class Demo {
    public static void main(String[] args) {
        Musician m = new Musician("°¢±þ");
        Instrument i= new Erhu();
        m.play(i);
        i = new Piano();
        m.play(i);
        i = new Violin();
        m.play(i);
    }
}
