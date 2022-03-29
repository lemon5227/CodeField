package Thread;

/**
 * 多线程的创建：
 * 方式一：继承于thread类
 * 1. 创建一个继承thread类的子类
 * 2. 重写thread类的run() --> 将此线程执行的操作声明在run()中
 * 3. 创建thread类的子类的对象
 * 4. 通过此对象调用start（）
 *
 *
 * 例子：遍历100以内所有的偶数
 */

//1. 创建一个继承thread类的子类
	class MyThread extends Thread {
		//2. 重写thread类的run()

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(i %2 == 0){
				System.out.println(Thread.currentThread().getName() + ":"+i);
			}
		}

	}
}
public class ThreadTest {
	public static void main(String[] args) {
		//3. 创建thread类的子类的对象
		MyThread myThread = new MyThread();
		//4. 通过此对象调用start（）①启动当前线程②调用当前线程的run()
		myThread.start();
		System.out.println("hello");
		MyThread myThread1 = new MyThread();
		myThread1.start();
	}
}
