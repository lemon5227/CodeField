/*
5����̶���һ��Ա����Employee���������£�
��1�������Ա������������String  name�������䣨int  age�����Ա�(String  sex)������(double sal)��
��2�������޲ι��췽�������ι��췽����
��3���������ϳ�Ա������Ӧ��getXxx()/setXxx()�������Լ�һ����ʾ���г�Ա��Ϣ��toString()������
��4�������ж��Ƿ�Ӱ�ķ���judge()��30������Ҫ�Ӱࣻ
��5������һ��������EmployeeDemo���ֱ�ʹ���޲ι��췽���ʹ��ι��췽������Employee������ʾ�ö������Ϣ���ж��Ƿ�Ҫ�Ӱࡣ���Խ�����£�
 */
package cn.num05;
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setName("��ԲԲ");
		emp1.setAge(18);
		emp1.setSex("Ů");
		emp1.setSal(8888.88);
		System.out.println(emp1);
		emp1.judge();
		System.out.println("--------------------------------------------------------");
		Employee emp2=new Employee("����ϼ", 35,"��",29999.99);
		System.out.println(emp2.toString());
		emp2.judge();
	}

}
