/*要想实现动态代理，需要解决的问题？
		*  问题一：如何根据加载内存中的内代理类，动态创建一个代理类及其对象
		*  问题二：当通过代理类的对象调用方法时，如何动态的去调用被代理类的同名方法*/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class newProxy{
	public static Object getProxyInstance(Object obj){
		newInvocationHandler handler = new newInvocationHandler();
		handler.bind(obj);
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),handler);
	}
}

class newInvocationHandler implements InvocationHandler {
	private Object obj;

	public void bind(Object obj){
		this.obj = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object returnValue = method.invoke(obj, args);

		return returnValue;
	}
}


interface Car{
	 String Kilemate();
	 void needs(String food);
}

class electionCar implements Car{

	@Override
	public String Kilemate() {
		return "续航：720KM";
	}

	@Override
	public void needs(String food) {
		System.out.println("我需要 "+food);
	}
}
public class Dynamic_Proxy2 {
	public static void main(String[] args) {
		electionCar c1 = new electionCar();
		Car proxyCar = (Car) newProxy.getProxyInstance(c1);
		System.out.println(proxyCar.Kilemate());
		proxyCar.needs("电力");
	}
}
