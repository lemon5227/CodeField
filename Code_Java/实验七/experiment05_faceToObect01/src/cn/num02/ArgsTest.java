/*
2���������������з������õĴ������⡣
��ʽ���������⣺
	�������ͣ���ʽ�����ĸı䲻Ӱ��ʵ�ʲ�����ʵ��Ӧ����ȷ����ֵ��
	                   ����ֵ���������ͼ����ܸ��ڶ�Ӧ���β��������͵ļ���
	                   �����Ĵ����൱�ڸ�ֵ��䣬��ʵ�ε�ֵ�����βΡ�
	�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ����������Ĵ����൱�ڸ�ֵ��䣬
	                  ʵ�εĵ�ַ�����βΣ�ʹ���βκ�ʵ��ָ��ͬһ�����ڴ�ռ䡣
	����㿴��һ��������Ҫ�Ĳ�����һ���������߽ӿ�������Ӧ��֪������ʵ����Ҫ����һ������Ķ���
*/
package cn.num02;
public class ArgsTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		Demo d = new Demo();
		int result = d.sum(a, b);// ������������������
		System.out.println(result);
		System.out.println("---------------------------");
		StudentDemo sd = new StudentDemo();
		Student s = new Student();
		sd.method(s);            // ������������������
	}
}
//��ʽ�����ǻ�������
class Demo {
	public int sum(int a, int b) {
		return a + b;
	}
}
//Student��һ���������ͣ��൱�ڻ��������е�ĳ�����ͣ�����int
class Student {
	public void show() {
		System.out.println("���ǰ�Java��");
	}
}
//��ʽ��������������
class StudentDemo {
	public void method(Student s) {
		s.show();
	}
}
