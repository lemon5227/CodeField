public class ExceptionDemo1 {

    public static void main(String[] args) {
        // ��һ�׶�
        int a = 10;
        int b = 0;
        int[] arr = { 1, 2, 3 };

        try {
            System.out.println(a / b);
        }catch (Exception e){
            System.out.println("��������Ϊ0");
        }
        try{
            System.out.println(arr[3]);
        }catch (Exception e){
            // �ڶ��׶�
            System.out.println("over");
        }




    }

}