package exp4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;

public class FileTiArrayListDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("list.txt"));
			String str=null;
			while((str = br.readLine()) != null){
				list.add(str);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				br.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println("读取结束");
		}

		list.forEach((v)-> System.out.println(v));
	}
}
