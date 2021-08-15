package exp10;

//定义一个函数式接口
@FunctionalInterface
interface Calcable {
    int calc(int num);
}
class CalcableDemo{   //普通类
    public void printAbs(int num, Calcable calcable) {
        System.out.println(calcable.calc(num));
    }
}
class Math {   //用户定义Math类
    //定义一个求绝对值方法
    public static int abs(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
}
//定义测试类
public class LambdaDemo3 {

    public static void main(String[] args) {
        CalcableDemo cd=new CalcableDemo();
        // 匿名内部类方式：
        Calcable ca = new Calcable() {
            @Override
            public int calc(int num) {
                return 10;
            }
        };
        cd.printAbs(10,ca);
// 使用Lambda表达式方式
        cd.printAbs(10,(int num)->{return num;});
        //使用Lambda表达式省略格式
        cd.printAbs(10,(num -> num));
        // 使用Lambda表达式的类名引用静态方法方式


    }


}