package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class exp26 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("Gyyyy年 MM 月 dd 日 : 今天是yyyy年的第D天，E");
        System.out.println(sdf.format(new Date()));
    }
}
