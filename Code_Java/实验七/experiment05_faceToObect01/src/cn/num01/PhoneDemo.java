/*
1、编程把现实生活的手机事物映射成一个标准类Phone，并定义一个测试类PhoneDemo测试Phone类的功能。步骤如下：
	（1）定义手机类Phone及以下成员变量：
			品牌：String  brand;
			价格：int    price;
			颜色：String  color;
	（2）针对每一个成员变量给出对应的getXxx()/setXxx()方法以及显示成员变量值的toString()方法。
	（3）定义一个测试类PhoneDemo测试功能，具体如下：创建一个对象，先通过getXxx()方法输出成员变量的值,再通过setXxx()方法给该对象的成员变量赋值，调用toString()方法显示对象的成员变量的值。测试结果如下：
 */
package cn.num01;
public class PhoneDemo {

	public static void main(String[] args) {
		Phone p=new Phone();
		System.out.println(p.getBrand()+"---"+p.getPrice()+"---"+p.getColor());
		System.out.println("----------------------");
		p.setBrand("华为");
		p.setPrice(3888);
		p.setColor("土豪金");
//		System.out.println(p.toString());
		System.out.println(p);

	}

}
