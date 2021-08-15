/*
5、编程定义一个员工类Employee。步骤如下：
（1）定义成员变量：姓名（String  name），年龄（int  age），性别(String  sex)、工资(double sal)；
（2）定义无参构造方法，带参构造方法；
（3）定义以上成员变量对应的getXxx()/setXxx()方法；以及一个显示所有成员信息的toString()方法；
（4）定义判断是否加班的方法judge()，30岁以下要加班；
（5）定义一个测试类EmployeeDemo，分别使用无参构造方法和带参构造方法创建Employee对象，显示该对象的信息并判断是否要加班。测试结果如下：
 */
package cn.num05;
public class EmployeeDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setName("高圆圆");
		emp1.setAge(18);
		emp1.setSex("女");
		emp1.setSal(8888.88);
		System.out.println(emp1);
		emp1.judge();
		System.out.println("--------------------------------------------------------");
		Employee emp2=new Employee("林青霞", 35,"男",29999.99);
		System.out.println(emp2.toString());
		emp2.judge();
	}

}
