package exp5;

import java.util.HashMap;

public class HashMapIncludedemo {
	public static void main(String[] args) {
		HashMap<String,Integer> rg172Map = new HashMap<String,Integer>();
		rg172Map.put("付诗雅",20);
		rg172Map.put("余欢",22);
		HashMap<String,Integer> rg173Map = new HashMap<String,Integer>();
		rg173Map.put("曹婷婷",21);
		rg173Map.put("许长权",18);
		HashMap<String,HashMap<String,Integer>> rjxyMap = new HashMap<String,HashMap<String,Integer>>();
		rjxyMap.put("rg172",rg172Map);
		rjxyMap.put("rg173",rg173Map);

		rjxyMap.forEach((k,v)-> {
			System.out.println(k);
			v.forEach((n,m)-> System.out.println(n+" "+m));
		});
	}
}
