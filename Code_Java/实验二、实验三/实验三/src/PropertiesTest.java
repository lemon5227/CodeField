import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileReader fr = new FileReader("prop.txt");
		Set set;

		prop.load(fr);
		set = prop.stringPropertyNames();
		for(Object s:set){
			String o = (String) s;
			if("lisi".equals(o)){
				prop.setProperty(o,"100");
			}
		}

		FileWriter fw = new FileWriter("prop.txt");
		prop.store(fw,"refrash data");

		fw.close();

	}
}
