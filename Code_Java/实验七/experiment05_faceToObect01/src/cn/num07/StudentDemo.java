/*
 7、编程定义一个学生类Student。步骤如下：
（1）定义成员变量：姓名（String  name），年龄（int  age），性别(char  sex)，其中name、sex为公有变量，age 为私有变量；
（2）定义无参构造方法，带参构造方法；
（3）定义私有成员变量age对应的getXxx()/setXxx()方法；以及一个显示所有成员信息的toString()方法；
（4）定义显示学生信息的方法showInfo()，要求能显示姓名、性别和年龄信息；
（5）定义一个测试类StudentDemo，使用无参构造方法创建Student对象s1，调用showInfo()方法显示s1对象的信息，使用带参构造方法创建Student对象s2，调用toString()方法显示s2对象的信息。
 */
package cn.num07;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="贾玲";
		s1.setAge(21);
		s1.sex='女';
		s1.showInfo();
		System.out.println("--------------------------");
		Student s2=new Student("岳云鹏", 26, '男');
		System.out.println(s2);

	}

}
