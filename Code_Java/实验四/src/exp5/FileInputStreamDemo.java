package exp5;

import java.io.UnsupportedEncodingException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s1 = "abcde";
		byte[] bys1 = s1.getBytes();
		System.out.println("字符串：" + s1 + "  的二进制编码的十进制值为：");
		for (byte b : bys1) {
			System.out.print(b + "\t");
		}
		System.out.println();
		String s2 = "我爱你中国";
		byte[] bys2 = s2.getBytes();
		System.out.println("字符串：" + s2 + "  的二进制编码的十进制值为：");
		for (byte b : bys2) {
			System.out.print(b + "\t");
		}
	}

}