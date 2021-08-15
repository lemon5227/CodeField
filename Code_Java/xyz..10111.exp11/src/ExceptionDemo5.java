import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

 public class ExceptionDemo5 {
    public static void main(String[] args) {
        String s="2021-5-31";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("今天天气不错啊"); //代码段1
        try {
            Date date=sdf.parse(s);  //代码段2
            System.out.println(date);//代码段3
        } catch (ParseException e) {
            e.printStackTrace(); //代码段4
//			System.exit(0); 
            return;
        }finally{ //无论异常是否发生，其语句体中的代码都将执行！  作用是释放资源，关闭打开的文件。
            System.out.println("这里的代码是必须执行的");  //代码段5
        }
        try{

        }finally{
            System.out.println("这里的代码是必须执行的");
        }
    }
}