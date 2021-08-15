package Interface;

/**
 * �ӿڵ�ʹ��
 * 1.�ӿ�ʹ��interface������
 * 2.java�У��ӿں���ʱ���е������ṹ
 * 3.��ζ���ӿڣ�����ӿ��еĳ�Ա
 *      3.1JDK7����ǰ��ֻ�ܶ���ȫ�ֳ����ͳ��󷽷�
 *      >ȫ�ֳ�����public static final��
 *      >���󷽷���public abstract��
 *      3.2JDK8: ���˶���ȫ�ֱ����ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ�����
 * 4.�ӿڲ��ܶ��幹��������ζ�Žӿڲ���ʵ����
 *
 * 5.Java�����У��ӿ�����ȥʵ�֣�implements���ķ���ʵ��
 *      ���ʵ���า���˽ӿ��е����Գ��󷽷�����ʵ����Ϳ���ʵ����
 *      ���ʵ����û�и��ǽӿ��е����Գ��󷽷������ʵ������Ϊһ��������
 * 6.Java�����ʵ�ֶ���ӿ� ----->�ֲ�Java���̳��Եľ���
 *          class AA extends BB implements CC,DD,EE
 * 7.�ӿ���ӿ�֮����Լ̳У����ҿ��Զ�̳�
 */

public class InterfaceTest {

}

interface Flyable{
    /**
     *          ȫ�ֳ���
     *      ��һ�����ٶȣ�����������ٶ�
     */
    public static final int MAX_SPEED = 7900;
    /**
     * ʡ����public static final����ʵ���Ǵ��ڵ�
     */
    int MIN_SPEED = 1;

    /**
     *          ���󷽷�
     */

    public abstract void fly();

    /**
     * ʡ��public abstract
     */

    void stop();


}

class plane implements Flyable{

    /**
     * ���󷽷�
     */
    @Override
    public void fly() {
        System.out.println("ͨ���������");

    }

    /**
     * ʡ��public abstract
     */
    @Override
    public void stop() {

    }
}
