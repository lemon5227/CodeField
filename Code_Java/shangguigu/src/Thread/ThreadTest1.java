package Thread;

/**
 * 创建多线程的方法二：实现runnable接口
 * 1. 创建一个实现了runnable接口的类
 * 2. 实现类去试下runnable中的抽象方法：run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5. 通过Thread类的对象调用start（）
 *
 *
 * 比较创建线程的两种方式。
 * 开发中，优先选择实现Runnable接口的方式
 * 原因：1. 实现的方式没有类的单继承局限性
 *      2. 实现的方式更适合来处理多个线程有共享数据的情况
 */

class MThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
}
public class ThreadTest1 {
	public static void main(String[] args) {
		//3.创建类的对象
		MThread mThread = new MThread();
		//4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
		Thread t1 =new Thread(mThread);
		//5.通过Thread类的对象调用start（） -->调用了Runnable类型的target的run()
		t1.start();
	}
}
