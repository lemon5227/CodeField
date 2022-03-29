package Thread;

/**
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 */
class Window3 extends Thread{
	private static int ticket = 100;
	@Override
	public void run() {
		while(true){
			if(ticket> 0){
				System.out.println(getName()+":卖票，票号为： "+ticket);
				ticket--;
			}else{
				break;
			}
		}
	}
	public static synchronized void show() {//同步监视器：Window3.class
		if(ticket> 0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":卖票，票号为： "+ticket);
			ticket--;
		}
	}
}
public class WindowTest3 {
	public static void main(String[] args) {
		Window3 t1 = new Window3();
		Window3 t2 = new Window3();
		Window3 t3 = new Window3();

		t1.setName("窗口一");
		t2.setName("窗口二");
		t3.setName("窗口三");
		t1.start();
		t2.start();
		t3.start();
	}
}
