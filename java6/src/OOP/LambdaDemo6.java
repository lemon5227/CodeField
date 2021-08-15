package OOP;

//定义一个函数式接口
@FunctionalInterface
interface Printable {
    void print(StringUtils su, String str);
}

//定义一个普通类PrintableDemo
class PrintableDemo {
    public void printUpper(StringUtils su, String s, Printable pt) {
        pt.print(su, s);
    }
}

//定义一个StringUtils类，并定义一个成员方法printUpperCase(String str)
class StringUtils {
    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
}

//定义测试类
public class LambdaDemo6 {
    public static void main(String[] args) {
        PrintableDemo pd = new PrintableDemo();
        StringUtils su = new StringUtils();
        //使用匿名内部类方式
        Printable p = new Printable() {
            @Override
            public void print(StringUtils su, String str) {
                su.printUpperCase(str);
            }
        };
        pd.printUpper(su, "HELLO", p);

        // 使用Lambda表达式方式
        pd.printUpper(su,"HELLO",(StringUtils s, String str)-> s.printUpperCase(str));
        //使用Lambda表达式省略格式
        pd.printUpper(su,"HELLO",(s,str)->s.printUpperCase(str));

        // 使用Lambda表达式的类名引用普通方法方式

    }
    }
