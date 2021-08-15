package test07;

public class KeyBoard implements Usb {
    @Override
    public void turnOn() {
        System.out.println("¼üÅÌÆô¶¯");
    }

    @Override
    public void turnOff() {
        System.out.println("¼üÅÌ¹Ø±Õ");
    }
}
