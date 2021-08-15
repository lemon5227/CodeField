package test07;

public class Demo {
    public static void main(String[] args) {
        Computer c = new Computer();
        Usb i = new KeyBoard();
        c.add(i);
        i= new Mouse();
        c.add(i);
        c.powerOn();
    }
}
