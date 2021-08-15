package exp10;

//定义一个函数式接口
@FunctionalInterface
interface Printable {
    void print(String str);
}

class PrintableDemo{   //普通类

    public void printUpper(String s, Printable pt) {
        pt.print(s);
    }
}

class StringUtils {
    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
}

//定义测试类
public class LambdaDemo4 {

    public static void main(String[] args) {
        PrintableDemo pd=new PrintableDemo();
        StringUtils stu = new StringUtils();
        //使用匿名内部类方式
        Printable p = new Printable() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };
        pd.printUpper("HELLO",p);

        // 使用Lambda表达式方式
        pd.printUpper("HELLO",(String str)->{
            System.out.println(str);
        });
        //使用Lambda表达式省略格式
        pd.printUpper("HELLO",(str -> System.out.println(str)));
        // 使用Lambda表达式的对象名引用方法方式



    }


}