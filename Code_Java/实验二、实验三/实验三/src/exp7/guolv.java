package exp7;

import java.util.stream.Stream;

public class guolv {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("林青霞", "王祖贤", "林娇", "林志颖", "林志玲");
		Stream<String> stream1 = stream.filter((String a)->{
			boolean b =a.substring(0,1).equals("林") && a.length() == 3;
			return b;
		});

		stream1.forEach(v-> System.out.println(v));
	}
}
