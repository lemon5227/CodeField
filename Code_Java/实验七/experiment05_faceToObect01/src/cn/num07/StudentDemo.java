/*
 7����̶���һ��ѧ����Student���������£�
��1�������Ա������������String  name�������䣨int  age�����Ա�(char  sex)������name��sexΪ���б�����age Ϊ˽�б�����
��2�������޲ι��췽�������ι��췽����
��3������˽�г�Ա����age��Ӧ��getXxx()/setXxx()�������Լ�һ����ʾ���г�Ա��Ϣ��toString()������
��4��������ʾѧ����Ϣ�ķ���showInfo()��Ҫ������ʾ�������Ա��������Ϣ��
��5������һ��������StudentDemo��ʹ���޲ι��췽������Student����s1������showInfo()������ʾs1�������Ϣ��ʹ�ô��ι��췽������Student����s2������toString()������ʾs2�������Ϣ��
 */
package cn.num07;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="����";
		s1.setAge(21);
		s1.sex='Ů';
		s1.showInfo();
		System.out.println("--------------------------");
		Student s2=new Student("������", 26, '��');
		System.out.println(s2);

	}

}
