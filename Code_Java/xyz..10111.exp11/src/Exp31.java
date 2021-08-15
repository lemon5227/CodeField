public class Exp31 {
    public static int divide(int x,int y) throws Exception{
        int result = x/y;
        return result;
    }

    public static void main(String[] args) throws Exception {
        int result = divide(4,0);
        System.out.println(result);
    }
}
