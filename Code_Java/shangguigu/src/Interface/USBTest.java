package Interface;

/**
 *          接口的使用
 * 1.接口满足多态性
 * 2.接口实际上是一种规范
 *
 */

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        //1.创建了接口的非匿名实现类的非匿名对象

        FLash fLash = new FLash();
        com.transferData(fLash);
        //2.创建接口的非匿名实现类的匿名对象

        com.transferData(new FLash());


        //3.创建匿名实现类的非匿名对象

        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机停止工作");
            }
        };

        com.transferData(phone);

        //4.创建匿名实现类的匿名对象

        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("MP3停止工作");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){
        usb.start();

        System.out.println("传输具体的数据");

        usb.stop();
    }
}

interface USB{
    void start();

    void stop();
}

class FLash implements USB{


    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}