package 实验一02;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		Iterator<String> it = list.iterator();
		System.out.println("---迭代器遍历方式");
		while(it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println("---增强for遍历方式");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("---JDK8的forEach遍历方式");
		list.forEach(o->{
			System.out.println(o);
		});
		
	}
}
