import java.util.Random;

public class Exp16 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("生成boolean类型的随机数："+r.nextBoolean());
        System.out.println("double:"+r.nextDouble());
        System.out.println("float:"+r.nextFloat());
        System.out.println("int:"+r.nextInt());
        System.out.println("0-10:"+r.nextInt(10));
        System.out.println("long:"+r.nextLong());
    }
}
