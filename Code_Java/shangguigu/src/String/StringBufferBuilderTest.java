package String;

import org.junit.Test;

public class StringBufferBuilderTest {
	@Test
	public void Test1(){
		StringBuffer sb = new StringBuffer("abc");
		sb.setCharAt(0, 'm');
		System.out.println(sb);
	}

}
