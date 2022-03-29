package Thread;

/**
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 */

class MyThread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(i %2 ==0){
				System.out.println(i);
			}
		}
	}
}

class Mythread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if(i % 2 !=0){
				System.out.println(i);
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
//		MyThread1 t1 =new MyThread1();
//		Mythread2 t2 = new Mythread2();
//		t1.start();
//		t2.start();
		//创建thread类的匿名子类
		new Thread(){
			@Override
			public void run() {
				for (int i = 0; i < 100; i++) {
					System.out.println(Thread.currentThread().getName()+":"+i);

				}
			}
		}.start();
	}
}
