import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        int temp;
        a = input.nextInt();
        b = input.nextInt();
        if(a<b){
            temp = a;
            a=b;
            b=temp;
        }
        for (int i=b;i>0;i--){
            if(a%i==0 && b%i==0){
                System.out.println("���Լ��Ϊ:"+i+"��С������Ϊ"+a*b/i);
                break;
            }
        }
    }
}
