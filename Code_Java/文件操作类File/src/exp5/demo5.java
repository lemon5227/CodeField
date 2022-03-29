package exp5;

import java.io.*;

public class demo5 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\");
		File alltxt = new File("alltxt");
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".txt");
			}
		});
		for(File f : files) {
			CopyFile(f,new File("alltxt",f.getName()));

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
