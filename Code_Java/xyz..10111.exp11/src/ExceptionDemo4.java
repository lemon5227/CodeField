public class ExceptionDemo4 {
    public static void main(String[] args) {
        method();
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // �������쳣
    private static void method2() throws Exception {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new Exception();// ���������׳��������쳣����
        } else {
            System.out.println(a / b);
        }
    }
    // �������쳣
    private static void method() throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException(); // ���������׳��쳣����
        } else {
            System.out.println(a / b);
        }
    }
}