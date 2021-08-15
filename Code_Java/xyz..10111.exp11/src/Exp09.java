import java.util.Properties;
import java.util.Set;

public class Exp09 {
    public static void main(String[] args) {
        Properties properties = System.getProperties();
        System.out.println(properties);
        Set<String>PropertyNames = properties.stringPropertyNames();
        for(String Key:PropertyNames){
            String value = System.getProperty(Key);
            System.out.println(Key+"----->"+value);
        }
    }
}
