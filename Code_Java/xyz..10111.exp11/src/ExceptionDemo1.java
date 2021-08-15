public class ExceptionDemo1 {

    public static void main(String[] args) {
        // 第一阶段
        int a = 10;
        int b = 0;
        int[] arr = { 1, 2, 3 };

        try {
            System.out.println(a / b);
        }catch (Exception e){
            System.out.println("除数不能为0");
        }
        try{
            System.out.println(arr[3]);
        }catch (Exception e){
            // 第二阶段
            System.out.println("over");
        }




    }

}