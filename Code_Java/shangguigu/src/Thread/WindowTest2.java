package Thread;

/**
 * 使用同步方法解决是实现的线程安全问题
 */
class Window2 implements Runnable {
	private int ticket = 100;//因为公用的一个实现所以不用加static
	@Override
	public void run() {
		while (true) {
			show();
		}
	}

	private synchronized void show(){ //同步监视器：this
		if(ticket > 0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":卖票，票号为： "+ticket);
			ticket--;
		}
	}
}


public class WindowTest2 {
	public static void main(String[] args) {
		Window2 w = new Window2();

		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);

		t1.start();
		t2.start();
		t3.start();



	}
}