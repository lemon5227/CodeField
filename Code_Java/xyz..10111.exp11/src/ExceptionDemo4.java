public class ExceptionDemo4 {
    public static void main(String[] args) {
        method();
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 编译期异常
    private static void method2() throws Exception {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new Exception();// 主动向外抛出编译期异常对象
        } else {
            System.out.println(a / b);
        }
    }
    // 运行期异常
    private static void method() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException(); // 主动向外抛出异常对象
        } else {
            System.out.println(a / b);
        }
    }
}