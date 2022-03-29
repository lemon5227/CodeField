import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class demo {

	public static void main(String[] args) throws IOException {
		File file1=new File("demos");
		File target=new File("test1");
		target.mkdir();
		copy(file1,target);
	}

	private static void copy(File file1, File target) throws IOException {
		File[] files=file1.listFiles();
		for (File file : files) {
			if(file.isFile())
			{
				FileInputStream bis = new FileInputStream(file);
				FileOutputStream bos = new FileOutputStream();
				byte []bys=new byte[1024];
				int len;
				while((len=bis.read(bys))!=-1) {
					bos.write(bys,0,len);
				}
				bis.close();
				bos.close();
			}
			else if(file.isDirectory())
				copy(file,target);
		}

	}


}
