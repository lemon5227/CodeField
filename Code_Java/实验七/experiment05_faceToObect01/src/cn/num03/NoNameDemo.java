/*
  3������������ʹ�����⡣
  ���������Ӧ�ó������£�
		A:���÷���������ֻ����һ�ε�ʱ��
			ע�⣺���ö�ε�ʱ�򣬲��ʺϡ�
			��ô����������������ʲô�ô���?
				�У��������������Ͼ���������
		B:�������������Ϊʵ�ʲ������ݸ���ʽ�������൱�ڸ�ֵ��䡣
 */
package cn.num03;
public class NoNameDemo {
	public static void main(String[] args) {
		Student s=new Student();
		s.show();
		s.show();
		System.out.println("----��������ĵ���----");
		//��������ĵ���
		//A:���÷���������ֻ����һ�ε�ʱ��
		new Student().show();
		System.out.println("-----����������Ϊʵ�ʲ�������---------");
		StudentDemo sd=new StudentDemo();
		//B:�������������Ϊʵ�ʲ�������
		sd.method(new Student());
		//����һ�����ر��,�ô���������������������Ӧ�ó���
		new StudentDemo().method(new Student());
		
	}

}
