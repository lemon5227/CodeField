package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exp26 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy�� MM �� dd �� : ������yyyy��ĵ�D�죬E");
        System.out.println(sdf.format(new Date()));
    }
}
