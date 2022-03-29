package exp4;

import java.util.Comparator;
import java.util.TreeMap;

public class TreemapDemo2 {
	public static void main(String[] args) {
		TreeMap<Student,String> tm2 = new TreeMap<Student,String>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				int result = Integer.valueOf(o1.age).compareTo(Integer.valueOf(o2.age));
				if(result != 0) {
					return result;
				}
				return  o1.name.compareTo(o2.name);

			}
		});

		tm2.put(new Student("潘安", 27),"晋朝");
		tm2.put(new Student("柳下惠", 30),"元朝");
		tm2.put(new Student("唐伯虎", 28),"明朝");
		tm2.put(new Student("赵子龙", 29),"三国");
		tm2.put(new Student("潘安", 27),"宋朝");
		tm2.put(new Student("潘美", 27),"唐朝");

		tm2.forEach((k,v) -> System.out.println(k+""+v));
	}

}
