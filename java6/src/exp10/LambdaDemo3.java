package exp10;

//����һ������ʽ�ӿ�
@FunctionalInterface
interface Calcable {
    int calc(int num);
}
class CalcableDemo{   //��ͨ��
    public void printAbs(int num, Calcable calcable) {
        System.out.println(calcable.calc(num));
    }
}
class Math {   //�û�����Math��
    //����һ�������ֵ����
    public static int abs(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }
}
//���������
public class LambdaDemo3 {

    public static void main(String[] args) {
        CalcableDemo cd=new CalcableDemo();
        // �����ڲ��෽ʽ��
        Calcable ca = new Calcable() {
            @Override
            public int calc(int num) {
                return 10;
            }
        };
        cd.printAbs(10,ca);
// ʹ��Lambda���ʽ��ʽ
        cd.printAbs(10,(int num)->{return num;});
        //ʹ��Lambda���ʽʡ�Ը�ʽ
        cd.printAbs(10,(num -> num));
        // ʹ��Lambda���ʽ���������þ�̬������ʽ


    }


}