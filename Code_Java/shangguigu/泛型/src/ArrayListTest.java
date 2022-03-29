import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 泛型不能是基本数据类，要是包装类
 */

public class ArrayListTest {
	@Test
	public void test1(){
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(78);
		list.add(75);
		//不能再加入非Integer
		//list.add("123");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		System.out.println(list);
	}

}
