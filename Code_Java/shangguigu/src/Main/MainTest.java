package Main;

/**
 * 1.mian��Ϊ��������
 * 2.mainҲ��һ����ͨ�ľ�̬����
 * 3.mian����������Ϊ���������̨�����ķ�ʽ��֮ǰʹ��scanner��
 *
 */

public class MainTest {
//    public static void main(String[] args) {
//        for(int i=0;i<args.length;i++){
//            System.out.println("******"+args[i]);
//
//            int num = Integer.parseInt(args[i]);
//            System.out.println("------"+args[i]);
//        }
//    }
    public static void main(String[] args) {
        Main.main(new String[100]);
    }
}

class Main{
    public static void main(String[] args){
        args = new String[100];
        for(int i =0;i<args.length;i++){
            args[i]="args"+i;
            System.out.println(args[i]);
        }
    }

}
