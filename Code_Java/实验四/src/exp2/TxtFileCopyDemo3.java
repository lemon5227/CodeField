package exp2;

import java.io.*;

public class TxtFileCopyDemo3 {
	public static void main(String[] args){
		BufferedReader br = null;
		BufferedWriter bw = null;

		String str=null;

		try {
			br = new BufferedReader(new FileReader("a.txt"));
			bw = new BufferedWriter(new FileWriter("b3.txt"));

			while((str = br.readLine()) != null){
				bw.write(str);
				bw.newLine();
				bw.flush();
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally {
			try{
				br.close();
			}catch (IOException e){
				e.printStackTrace();
			}

			try {
				bw.close();
			}catch (IOException e){
				e.printStackTrace();
			}

			System.out.println("文本文件拷贝成功！");
		}
	}
}
