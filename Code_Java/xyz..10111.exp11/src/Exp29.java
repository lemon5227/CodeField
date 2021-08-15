public class Exp29 {
    public static int divide(int x,int y){
        try{
            int result =x/y;
            return result;
        }catch (Exception e){
            System.out.println("捕获的错误信息是："+e.getMessage());
        }
        return -1;
    }
    public static void main(String[] args){
        int result=divide(4,0);
        if(result == -1){
            System.out.println("程序发生异常");
        }else {
            System.out.println(result);
        }
    }
}
