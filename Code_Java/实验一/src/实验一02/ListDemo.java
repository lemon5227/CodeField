package ʵ��һ02;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		Iterator<String> it = list.iterator();
		System.out.println("---������������ʽ");
		while(it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
		}
		System.out.println("---��ǿfor������ʽ");
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println("---JDK8��forEach������ʽ");
		list.forEach(o->{
			System.out.println(o);
		});
		
	}
}
