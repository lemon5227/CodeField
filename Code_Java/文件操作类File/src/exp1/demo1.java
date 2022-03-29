package exp1;

import java.io.File;
import java.io.FileFilter;

public class demo1 {
	public static void main(String[] args) {
		File file = new File("D:\\");
		File[] files = file.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isFile() && pathname.getName().toLowerCase().endsWith(".jpg");
			}
		});
		for(File f:files) {
			System.out.println(f);
		}

	}
}
