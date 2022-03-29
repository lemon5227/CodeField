package exp9;

import java.util.stream.Stream;

public class jumpAndPick {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("林青霞", "王祖贤", "林凤娇", "林志颖", "林志玲");
		Stream<String> stream1 = stream.skip(1).limit(2);

		stream1.forEach(v-> System.out.println(v));
	}
}
