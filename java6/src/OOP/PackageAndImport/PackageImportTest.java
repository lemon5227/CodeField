package OOP.PackageAndImport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 一，package关键词的使用
 * 1.为了更好的实现项目类的管理，提供包的概念
 * 2.使用package声明类或接口所属的包，声明在源文件的首行
 * 3.包，是属于标识符，遵循标识符的命名规则，规范（xxxyyyzzz），“见名知意“
 * 4.每”.“一次，就是一层文件目录
 *
 * 补充：同一个包下不能命名同名的接口或包名或类
 *
 * 二，Import关键词的使用
 *  import：导入
 *  1.源文件在显式的使用import结构导入指定包下的类，接口
 *  2.声明在包的声明和类的声明之间
 *  3.如果需要导入多个结构，则并列写出即可
 *  4.可以使用”XXX.*“的方式，表示导入XXX包下的所以结构
 *  5.如果使用的类或接口是java.lang下定义的，则可以省略import结构
 *  6.如果使用的类或接口是本包下定义的,则可以省略import结构
 *  7.如果在源文件中，使用了不同的包下的同名的类，则必须至少要有一个类需要以全类名的方式显示
 *  8.可以使用”XXX.*“的方式，表示导入XXX包下的所以结构，但如果使用的是XXX的字包仍然需要导包
 *
 *  9.import static ：导入指定的类或接口中的静态结构
 */

public class PackageImportTest {
    public static void main(String[] args) {
        String info = Arrays.toString(new int[]{1,2,3});
        ArrayList list = new ArrayList();
        HashMap map = new HashMap();
        Scanner s =null;
        System.out.println("hello!");
    }
}
