package exp6;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapIncludeArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> arry1 = new ArrayList<>();
		ArrayList<String> arry2 =new ArrayList<>();
		ArrayList<String> arry3 =new ArrayList<>();
		HashMap<String,ArrayList<String>> hm = new HashMap<>();

		arry1.add("诸葛亮");
		arry1.add("周瑜");

		arry2.add("令狐冲");
		arry2.add("林平之");

		arry3.add("郭靖");
		arry3.add("杨过");

		hm.put("三国演义",arry1);
		hm.put("笑傲江湖",arry2);
		hm.put("神雕侠侣",arry3);

		hm.forEach((k,v)->{
			System.out.println(k);
			v.forEach(o-> System.out.println(o));
		});
	}
}
