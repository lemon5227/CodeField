public class Exp36 {
    public static int divide(int x,int y) throws DivideByMinusExp{
        if(y==0){
            throw new DivideByMinusExp("除数是零");
        }
        int result = x/y;
        return result;
    }

    public static void main(String[] args) {
        try {
            int result = divide(4,0);
            System.out.println(result);
        }catch (DivideByMinusExp e){
            System.out.println("捕获的错误信息为："+ e.getMessage());
        }
    }
}
