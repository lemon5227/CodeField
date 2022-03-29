package exp3;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Student,String> hm = new HashMap<Student,String>();
		hm.put(new Student("西施", 27),"9999");
		hm.put(new Student("王昭君", 30),"8888");
		hm.put(new Student("貂蝉", 29),"6666");
		hm.put(new Student("杨玉环", 26),"7777");
		hm.put(new Student("西施", 27),"5555");
		hm.forEach((k,v)-> System.out.println(k+" "+v));
	}
}
