package Thread;

/**
 * 测试thread中的常用方法：
 * 1. start（）：启动当前线程；调用当前线程的run()
 * 2. run():通常需要重写Thread类中的此方法，将创建的线程操作声明在此方法中
 * 3. currentThread():静态方法，返回当先执行的线程
 * 4.getName(): 获取当前线程的名字
 * 5.setName（）：设置当前线程的名字
 * 6.yield():释放当前CPU的执行权
 * 7.join()： 在线程a中调用线程b的join（），此时线程a就进入阻塞状态，知道线程b执行结束
 * 8.stop():已过时。当执行此方法时，强制结束线程
 * 9.sleep（long millitime）:当前线程“睡眠”，处于阻塞状态
 * 10.isAlive():判断线程是否存活
 *
 *
 * 线程的优先级：
 *  1.
 *  MAX_PRIORITY:10
 *  MIN_PRIORITY:1
 *  NORM_PRIORITY:5
 *  2.
 *  如何获取和设置当前线程的优先级：
 *      getPriority():获取线程的优先级
 *      setPriority(int p):设置线程的优先级
 *
 *      说明：
 *      高优先级的线程要抢占低优先级线程CPU的执行权，但是只是从概率上讲，高优先级的线程高概率被执行，并不是
 *      只有高优先级执行完再执行低优先级
 *
ga  * */
class HelloThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(i % 2 ==0){
				System.out.println(Thread.currentThread().getName() + ":"+i);
			}
			if(i %20 ==0){
				this.yield();
			}
		}
	}
	public HelloThread(String name){
		super(name);
	}
}
public class ThreadMethodTest {
	public static void main(String[] args) {
		HelloThread t1 =new HelloThread("一");
		t1.start();
	}
}
