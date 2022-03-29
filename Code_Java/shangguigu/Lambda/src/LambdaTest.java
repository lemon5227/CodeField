import org.junit.Test;

import java.util.Comparator;

public class LambdaTest {
	@Test
	public void test() {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("我爱北京天安门");
			}
		};
		r1.run();

		System.out.println("-------------------------");
		Runnable r2 = () -> System.out.println("我爱中华");
		r2.run();
	}

	@Test
	public void test2(){
		Comparator com1 = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return Integer.compare(01,02);
			}
		};
		int compare1 = com1.compare(21,12);
		System.out.println(compare1);
		//Lambda
		Comparator<Integer> com2 = (o1,o2) -> Integer.compare(o1,o2);
		int compare2 = com2.compare(21,12);
		System.out.println(compare2);

		//方法引用
		Comparator<Integer> com3 = Integer :: compare;
		int compare3 = com3.compare(21,12);
		System.out.println(compare3);

	}
}
