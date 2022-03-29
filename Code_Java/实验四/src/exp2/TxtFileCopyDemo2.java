package exp2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TxtFileCopyDemo2 {
	public static void main(String[] args) {
		File file1 = new File("a.txt");
		File file2 = new File("b2.txt");

		FileInputStream in1 = null;
		FileOutputStream out1 = null;

		try {
			in1 = new FileInputStream(file1);
			out1 = new FileOutputStream(file2);

			int len;
			byte[] bytes = new byte[5];
			while ((len = in1.read(bytes)) != -1){
				out1.write(bytes,0,len);
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			try {
				in1.close();
			}catch (IOException e){
				e.printStackTrace();
			}
			try {
				out1.close();
			}catch (IOException e){
				e.printStackTrace();
			}
			System.out.println("文本文件拷贝成功！");
		}
	}
}
