package exp3;

import java.io.File;

public class demo3 {
	public static void main(String[] args) {
		File file = new File("demo");
		File[] files = file.listFiles();
		demo3 d = new demo3();
		d.deleteDir(files);
	}

	public static void deleteDir(File[] files){
		for(File file : files){
			if(file.isDirectory()){
				File[] new_files = file.listFiles();
				deleteDir(new_files);
			}else{
				System.out.println(file.getName() + "---true");
				file.delete();
			}
		}
	}
}
