/**
 *  》动态代理是指客户通过代理类来调用其他对象的方法，并且在程序运行时根据
 *  需要动态创建目标类得代理对象
 *  》动态代理使用场合：
 *      》调试
 *      》远程方法调用
 *  》动态代理相比静态代理的有点
 *      抽象角色中（接口）声明的所有方法都被转移到调用处理器一个集中的方法中处理，
 *      这样，我们可以更灵活和统一的处理众多的方法
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  动态代理举例：
 *
 */

interface Human{
	String getBelief();

	void eat(String food);
}

//被代理类
class SuperMan implements Human{



	@Override
	public String getBelief() {
		return "I believe I can fly";
	}

	@Override
	public void eat(String food) {
		System.out.println("我喜欢吃" + food);
	}
}

class HunmanUtil{
	public void method1(){
		System.out.println("====通用方法====");
	}

	public void method2(){
		System.out.println("====通用方法二====");
	}
}

/**
 *  要想实现动态代理，需要解决的问题？
 *  问题一：如何根据加载内存中的内代理类，动态创建一个代理类及其对象
 *  问题二：当通过代理类的对象调用方法时，如何动态的去调用被代理类的同名方法
 */
class ProxyFactory{
	//调用此方法，返回一个代理类的对象。解决问题一
	public static Object getProxyInstance(Object obj){//obj：被代理类的对象
		MyInvocationHandler handler = new MyInvocationHandler();

		handler.bind(obj);

		return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
	}
}

class MyInvocationHandler implements InvocationHandler {

	private  Object obj;//需要使用被代理类的对象进行赋值

	public void bind(Object obj){
		this.obj = obj;
	}

	//当我们通过代理类的对象，调用方法a时，就会自动的调用如下的方法invoke()
	//将被代理类要执行的方法a的功能就声明在invoke（）中
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		HunmanUtil util = new HunmanUtil();
		util.method1();

		//method：即为代理类对象调用的方法，此方法也就被作为代理类对象要调用的方法
		//obj:被代理类的对象
		Object returnValue = method.invoke(obj, args);
		//上述方法的返回值作为当前类invoke()返回值

		util.method2();
		return returnValue;
	}
}

public class Dynamic_Proxy {
	public static void main(String[] args) {
		SuperMan superMan = new SuperMan();
		//proxyInstance；代理类的对象
		Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
		System.out.println(proxyInstance.getBelief());
		proxyInstance.eat("麻辣烫");

		System.out.println("*************************");
		NikeClothFactory nikeClothFactory = new NikeClothFactory();
		ClothFactory proxyClothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);

		proxyClothFactory.produceCloth();
	}
}
