package exp1;

import java.io.*;

public class CopyFileDemo4 {
	public static void main(String[] args) {
		File file1 = new File("mingw-2.png");
		File file2 = new File("mingw-2_copy4.png");

		BufferedInputStream bin1 = null;
		BufferedOutputStream bout1 = null;

		try{
			FileInputStream in1 = new FileInputStream(file1);
			FileOutputStream out1 = new FileOutputStream(file2);

			bin1 = new BufferedInputStream(in1);
			bout1 = new BufferedOutputStream(out1);

			byte[] bytes = new byte[5];
			int len;
			while ((len = bin1.read(bytes)) != -1){
				bout1.write(bytes,0,len);
			}
		}catch(IOException e){
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
