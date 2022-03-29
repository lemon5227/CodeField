package Thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题的方式三：Lock锁
 * 1.面试题：synchronized和Lock有什么区别
 *  同：二者都可以解决线程安全问题
 *  异：synchronized机制在执行完相应的同步代码后，自动的释放同步监视器
 *      Lock需要在结束时手动释放
 *  2.面试题
 *      如何解决线程安全问题，有几种方法
 *      三种，同步代码块、同步方法、Lock
 * 2.优先使用顺序
 *  Lock->同步代码块（已进入方法体，分配了相应资源）->同步方法（在方法体之外）
 */
class window implements Runnable {

	private int ticket = 100;

	private ReentrantLock lock = new ReentrantLock();
	@Override
	public void run() {
		while (true) {
			try {
				lock.lock();
				if(ticket> 0){
					System.out.println(Thread.currentThread().getName()+"票号："+ticket);
					ticket--;
				}
			}finally {
				lock.unlock();
			}
		}
	}
}
public class LockTest {
	public static void main(String[] args) {
		window w = new window();

		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);

		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		t1.start();
		t2.start();
		t3.start();

	}
}
