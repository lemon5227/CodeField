/*
 6����̶���һ��������Manager���������£�
��1�������Ա������������String  name�������䣨int  age�����Ա�(String  sex)������(double sal)��
��2�������޲ι��췽�������ι��췽����
��3���������ϳ�Ա������Ӧ��getXxx()/setXxx()�������Լ�һ����ʾ���г�Ա��Ϣ��toString()������
��4�������ж��Ƿ�Ӱ�ķ���judge()��40������Ҫ�Ӱࣻ
��5������һ��������ManagerDemo���ֱ�ʹ���޲ι��췽���ʹ��ι��췽������Employee������ʾ�ö������Ϣ���ж��Ƿ�Ҫ�Ӱࡣ���Խ�����£�
 */
package cn.num06;
public class ManagerDemo {

	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.setName("١���");
		m1.setAge(27);
		m1.setSex("Ů");
		m1.setSal(8888.88);
		System.out.println(m1);
		m1.judge();
		System.out.println("--------------------------------------------------------");
		Manager m2=new Manager("������", 35,"��",29999.99);
		System.out.println(m2.toString());
		m2.judge();

	}

}
