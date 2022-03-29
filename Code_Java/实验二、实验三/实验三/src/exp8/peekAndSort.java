package exp8;

import java.util.stream.Stream;

public class peekAndSort {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("ab","ac","cb","cc","ca");
		Stream<String> stream1 = stream.filter((String a)->{
			boolean b = a.substring(0,1).equals("c");
			return b;
		}).sorted();

		stream1.forEach(v-> System.out.println(v));
	}
}
