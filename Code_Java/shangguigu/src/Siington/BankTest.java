package Siington;

/**
 * 使用同步机制将单例模式中的懒汉式改写为线程安全的
 */
public class BankTest {
}

//class Bank1{
//	private Bank1(){}
//	private static Bank1 instance = null;
//	public static synchronized Bank1 getInstance(){
//		if(instance == null){
//			instance = new Bank1();
//		}
//		return instance;
//	}
//}
class Bank1{
	private Bank1(){}
	private static Bank1 instance = null;

	public static  Bank1 getInstance(){
		//方法一：效率不高
//		synchronized (Bank1.class) {
//			if(instance == null){
//				instance = new Bank1();
//			}
//			return instance;
//		}
		//方式二
		if(instance == null){
			synchronized (Bank1.class){
				if(instance == null){
					instance = new Bank1();
				}
			}
		}
		return instance;
	}
}
