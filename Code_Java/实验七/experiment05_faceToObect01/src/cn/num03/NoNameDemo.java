/*
  3、匿名对象及其使用问题。
  匿名对象的应用场景如下：
		A:调用方法，仅仅只调用一次的时候。
			注意：调用多次的时候，不适合。
			那么，这种匿名调用有什么好处吗?
				有，匿名对象调用完毕就是垃圾。
		B:匿名对象可以作为实际参数传递给形式参数，相当于赋值语句。
 */
package cn.num03;
public class NoNameDemo {
	public static void main(String[] args) {
		Student s=new Student();
		s.show();
		s.show();
		System.out.println("----匿名对象的调用----");
		//匿名对象的调用
		//A:调用方法，仅仅只调用一次的时候。
		new Student().show();
		System.out.println("-----匿名对象作为实际参数传递---------");
		StudentDemo sd=new StudentDemo();
		//B:匿名对象可以作为实际参数传递
		sd.method(new Student());
		//再玩一个更特别的,该代码包括了匿名对象的两个应用场景
		new StudentDemo().method(new Student());
		
	}

}
