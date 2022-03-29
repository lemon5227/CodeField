package exp1;

import java.io.*;

/**
 * 基本输入流 读取一个字节
 */
public class CopyFileDemo2 {
	public static void main(String[] args) {
		File file1 = new File("mingw-2.png");
		File file2 = new File("mingw-2_copy2.png");

		FileInputStream in1 = null;
		FileOutputStream out1 = null;
		try{
			in1 = new FileInputStream(file1);
			out1 = new FileOutputStream(file2);

			int len;
			while ((len = in1.read())!= -1){
				out1.write(len);
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
