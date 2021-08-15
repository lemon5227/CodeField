/*
 6、编程定义一个经理类Manager。步骤如下：
（1）定义成员变量：姓名（String  name），年龄（int  age），性别(String  sex)、工资(double sal)；
（2）定义无参构造方法，带参构造方法；
（3）定义以上成员变量对应的getXxx()/setXxx()方法；以及一个显示所有成员信息的toString()方法；
（4）定义判断是否加班的方法judge()，40岁以下要加班；
（5）定义一个测试类ManagerDemo，分别使用无参构造方法和带参构造方法创建Employee对象，显示该对象的信息并判断是否要加班。测试结果如下：
 */
package cn.num06;
public class ManagerDemo {

	public static void main(String[] args) {
		Manager m1=new Manager();
		m1.setName("佟丽娅");
		m1.setAge(27);
		m1.setSex("女");
		m1.setSal(8888.88);
		System.out.println(m1);
		m1.judge();
		System.out.println("--------------------------------------------------------");
		Manager m2=new Manager("蔡徐坤", 35,"男",29999.99);
		System.out.println(m2.toString());
		m2.judge();

	}

}
