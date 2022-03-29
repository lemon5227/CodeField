package exp3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("hello");
		list.add("world");
		list.add("java");
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("list.txt"));
			for(String str:list){
				bw.write(str);
				bw.newLine();
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bw.close();
			}catch (IOException e){
				e.printStackTrace();
			}

			System.out.println("拷贝完成");
		}

	}
}
