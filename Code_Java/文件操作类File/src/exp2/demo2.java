package exp2;

import java.io.File;

public class demo2 {
	public static void main(String[] args) {
		File file = new File("D:\\CodeField\\Code_Java");
		File[] files = file.listFiles();
		demo2 d = new demo2();
		d.search(files);

	}
	public static void search(File[] files){
		for(File f : files){
			if(f.isDirectory()){
				File[] new_files = f.listFiles();
				search(new_files);
			}else{
				if(f.getName().endsWith(".java")){
					System.out.println(f);
				}
			}
		}
	}
}
