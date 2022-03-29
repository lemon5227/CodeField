import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ForTest {
	@Test
	public void test1(){
		Collection  coll = new ArrayList();

		coll.add("AA");
		coll.add(1230);//自动装箱

		//for(集合元素类型 局部变量 : 集合对象)
		for(Object o : coll){
			System.out.println(o);
		}

	}

	public void test2(){
		String[] arr = new String[]{"mm","mm"};

	}
}
