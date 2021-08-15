import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("今天天气还不错啊！");
        try {
            methoed();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        method2();
        System.out.println("可惜天气有点热啊");
    }
    // 运行期异常的抛出
    private static void method2() throws ArithmeticException{
        int a=10;
        int b=0;
        System.out.println(a/b);
    }
    // 编译期异常的抛出
    // 在方法声明上抛出，是为了告诉调用者，你注意了，我有问题。
    private static void methoed() throws ParseException {
        String s = "2021-5-31";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:ss:mm");
        Date date = sdf.parse(s);
        System.out.println(date);
    }
}