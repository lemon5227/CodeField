import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileReader fr = new FileReader("count.txt");

		prop.load(fr);
		fr.close();
		int number = Integer.parseInt(prop.getProperty("count"));
		if(number <=1){
			System.out.println("游戏试玩已结束，请付费！");
		}else{
			System.out.println("猜数字游戏开始！");
			String count = String.valueOf(number-1);
			prop.setProperty("count",count);
			System.out.println("您还有4次试玩机会！");
			FileWriter fw = new FileWriter("count.txt");
			prop.store(fw,"refresh data");

		}


	}
}
