import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		prop.setProperty("高圆圆","30");
		prop.setProperty("迪丽热巴","23");
		prop.setProperty("林青霞","27");

		FileWriter fw = new FileWriter("name.txt");

		prop.store(fw,"save data");
		fw.close();

	}
}
