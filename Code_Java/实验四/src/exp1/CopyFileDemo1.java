package exp1;

import java.io.*;

/**
 * 基本输出流 读写一个字符数组
 */
public class CopyFileDemo1 {
	public static void main(String[] args) {
		File file1 = new File("mingw-2.png");
		File file2 = new File("mingw-2_copy.png");

		FileInputStream in1 = null;
		FileOutputStream out1 = null;

		try {
			in1 = new FileInputStream(file1);
			out1 = new FileOutputStream(file2);
			byte[] bytes = new byte[5];
			int len;
			while ((len = in1.read(bytes))!=-1){
				out1.write(bytes,0,len);
			}
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}finally {
			if(out1 != null){
				try{
					out1.close();
				}catch (IOException e){
					e.printStackTrace();
				}
			}
			if(in1 != null){
				try {
					out1.close();
				}catch (IOException e){
					e.printStackTrace();
				}
			}
		}
	}

}
