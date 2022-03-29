import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 */

public class TreeSetTest {
	/**
	 * 1.向TreeSet 中添加数据，要求是相同类的对象
	 * 2.两种排序方法：自然排序(实现Comparable接口)和定制排序（Comparator）
	 *
	 * 3.自然排序，比较两个对象是否相同的标准为：compareTo()返回0，不再进行equals()
	 * 4.定制排序中，比较两个对象是否相同的标准为：compare()返回0，不再进行equals()
	 */
	@Test
	public void test1(){
		TreeSet ts = new TreeSet();

		//失败，不能添加为不同的类的对象
		/*ts.add(123);
		ts.add(456);
		ts.add("AA");*/

		/*ts.add(123);
		ts.add(-8);
		ts.add(888);
		*/

		ts.add(new User("tom",12));
		ts.add(new User("mike",18));
		ts.add(new User("mike",32));
		Iterator it = ts.iterator();

		while (it.hasNext()){
			System.out.println(it.next());
		}
	}

	@Test
	public void test2(){
		Comparator com = new Comparator() {
			//按照年龄从很小到大
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof User && o2 instanceof User){
					User u1 = (User)o1;
					User u2 = (User)o2;
					return Integer.compare(u1.age,u2.age);
				}else{
					throw new RuntimeException("输入数据类型不匹配");
				}
			}
		};
		TreeSet ts = new TreeSet(com);
		ts.add(new User("tom",12));
		ts.add(new User("mike",18));
		ts.add(new User("mike",32));

		Iterator it = ts.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}
