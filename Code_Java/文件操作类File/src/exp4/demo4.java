package exp4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo4 {
	public static void main(String[] args) throws IOException {
		File file1 = new File("demos");
		File file2 = new File("test");
		CopyDir(file1,file2);
	}

	public static  void CopyDir(File srcFile,File destFile) throws IOException {
		if(!destFile.exists()){
			destFile.mkdirs();
		}

		File[] files = srcFile.listFiles();

		for(File file : files){
			if(file.isFile()){
				CopyFile(file,new File(destFile,file.getName()));
			}else if(file.isDirectory()){
				CopyDir(file,new File(destFile,file.getName()));
			}
		}
	}

	public static void CopyFile(File srcFile, File destFile) throws IOException {
		FileInputStream in = new FileInputStream(srcFile);
		FileOutputStream out = new FileOutputStream(destFile);
		int  len;
		byte[] buffer = new byte[1024];
		while ((len = in.read(buffer)) != -1) {
			out.write(buffer, 0, len);
			out.flush();
		}
		in.close();
		out.close();

	}
}
