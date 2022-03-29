package exp4;

import java.util.TreeMap;

public class TreemapDemo1 {
	public static void main(String[] args) {
		TreeMap<Student,String> tm1 = new TreeMap<Student,String>();
		tm1.put(new Student("潘安", 27),"晋朝");
		tm1.put(new Student("柳下惠", 30),"元朝");
		tm1.put(new Student("唐伯虎", 28),"明朝");
		tm1.put(new Student("赵子龙", 29),"三国");
		tm1.put(new Student("潘安", 27),"宋朝");
		tm1.put(new Student("潘美", 27),"唐朝");

		tm1.forEach((k,v) -> System.out.println(k+" "+v));
	}
}
