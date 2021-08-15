package Main;

/**
 * 1.mian作为程序的入口
 * 2.main也是一个普通的静态方法
 * 3.mian方法可以作为我们与控制台交互的方式（之前使用scanner）
 *
 */

public class MainTest {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.println("******"+args[i]);

            int num = Integer.parseInt(args[i]);
            System.out.println("------"+args[i]);
        }
    }
}
