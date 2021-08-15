package test07;

public class Mouse implements Usb {
    @Override
    public void turnOn() {
        System.out.println("鼠标启动");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标关闭");
    }
}
