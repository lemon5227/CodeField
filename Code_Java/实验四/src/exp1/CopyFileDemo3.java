package exp1;

import java.io.*;

/**
 * 缓冲字节流 读取一个字节
 */
public class CopyFileDemo3 {
	public static void main(String[] args) {
		File file1 = new File("mingw-2.png");
		File file2 = new File("mingw-2_copy3.png");

		BufferedInputStream bin1 = null;
		BufferedOutputStream bout1 = null;

		try{
			FileInputStream in1 = new FileInputStream(file1);
			FileOutputStream out1 = new FileOutputStream(file2);

			bin1 = new BufferedInputStream(in1);
			bout1 = new BufferedOutputStream(out1);

			int len;
			while ((len = bin1.read()) != -1){
				bout1.write(len);
			}
		}catch (IOException e){
			e.printStackTrace();
		}finally{
			try {
				bin1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try{
				bout1.close();
			}catch (IOException e){
				e.printStackTrace();
			}
		}
	}
}
