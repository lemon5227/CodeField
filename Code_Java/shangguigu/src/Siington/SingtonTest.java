package Siington;

/**
 * ����
 * ����ʽ�� �ô� �ӳٶ���Ĵ��������� �̲߳���ȫ
 * ����ʽ�� ���� �������ʱ�䳤�� �ô� �̰߳�ȫ
 */

public class SingtonTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
    }
}

/* ����ʽ */

class Bank{
    /**
     * 1.˽�л�����iȥ
     */
    private Bank(){

    }
    /**
     * 2.�ڲ�������Ķ���
     * ����Ҳ�����Ǿ�̬��
     */
    private  static Bank instance = new Bank();

    /**
     * 3.�ṩ�����ľ�̬������������Ķ���
     */
    public static Bank getInstance(){
        return instance;
    }
}