package Siington;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * ����ʽʵ��
 */
public class SingtonTest2 {
}

class Order{
    /**
     * ˽�л�������
     */
    private Order(){

    }

    /**
     * ������ǰ�����û�г�ʼ��
     */
    private static Order instance = null;

    /**
     * ����public static �ķ��ص�ǰ������ķ���
     */

    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}