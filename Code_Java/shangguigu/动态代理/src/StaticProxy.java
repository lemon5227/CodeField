import org.junit.Test;

/**
 *  静态代理举例：
 *
 *  特点：代理类和被代理类在编译期间，就确定下来了
 */

interface ClothFactory {
	void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory {
	private ClothFactory factory;//用被代理类的对象进行实例化

	public ProxyClothFactory(ClothFactory factory) {
		this.factory = factory;
	}

	@Override
	public void produceCloth() {
		System.out.println("代理工厂做一些准备工作");

		factory.produceCloth();

		System.out.println("代理工厂做一些后续的收尾工作");
	}
}

//被代理类
class NikeClothFactory implements ClothFactory {



	@Override
	public void produceCloth() {
		System.out.println("Nike 工厂生产一批工作服");
	}
}
public class StaticProxy {
	@Test
	public void test1(){
		//创建被代理类的对象
		NikeClothFactory nike = new NikeClothFactory();
		ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);
		//创建代理类的对象
		proxyClothFactory.produceCloth();
	}
}
