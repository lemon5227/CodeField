package Interface;

/**
 *          �ӿڵ�ʹ��
 * 1.�ӿ������̬��
 * 2.�ӿ�ʵ������һ�ֹ淶
 *
 */

public class USBTest {
    public static void main(String[] args) {
        Computer com = new Computer();
        //1.�����˽ӿڵķ�����ʵ����ķ���������

        FLash fLash = new FLash();
        com.transferData(fLash);
        //2.�����ӿڵķ�����ʵ�������������

        com.transferData(new FLash());


        //3.��������ʵ����ķ���������

        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("�ֻ���ʼ����");
            }

            @Override
            public void stop() {
                System.out.println("�ֻ�ֹͣ����");
            }
        };

        com.transferData(phone);

        //4.��������ʵ�������������

        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("MP3��ʼ����");
            }

            @Override
            public void stop() {
                System.out.println("MP3ֹͣ����");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){
        usb.start();

        System.out.println("������������");

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
        System.out.println("U�̿�ʼ����");
    }

    @Override
    public void stop() {
        System.out.println("U�̽�������");
    }
}