import org.junit.Test;

import java.util.*;

/**
 * TreeMap 中添加Key-value，要求key必须是由同一个类创建的对象
 * 因为要按照key进行排序：自然排序、定制排序
 */
public class TreeMapTest {
	//自然排序
	@Test
	public void test1(){
		TreeMap tm = new TreeMap();
		User u1 = new User("tom", 18);
		User u2 = new User("mike", 28);
		User u3 = new User("jerry", 38);

		tm.put(u1,98);
		tm.put(u2,78);
		tm.put(u3,23);


		Set entrySet = tm.entrySet();
		Iterator it = entrySet.iterator();
		while(it.hasNext()){
			Object o = it.next();
			Map.Entry entry = (Map.Entry) o;
			System.out.println(entry.getKey()+"-----"+entry.getValue());
		}
	}
	//定制排序
	@Test
	public void test2(){
		TreeMap map = new TreeMap(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if(o1 instanceof User && o2 instanceof User){
					User u1 = (User) o1;
					User u2 = (User) o2;
					return Integer.compare(u1.age,u2.age);
				}else{
					throw new RuntimeException("输入的类型不匹配");
				}
			}
		});
		User u1 = new User("tom", 18);
		User u2 = new User("mike", 28);
		User u3 = new User("jerry", 38);

		map.put(u1,98);
		map.put(u2,78);
		map.put(u3,23);
		Set entrySet = map.entrySet();
		Iterator it = entrySet.iterator();
		while(it.hasNext()){
			Object o = it.next();
			Map.Entry entry = (Map.Entry) o;
			System.out.println(entry.getKey()+"-----"+entry.getValue());
		}
	}
}
