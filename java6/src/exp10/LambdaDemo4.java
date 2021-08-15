package exp10;

//����һ������ʽ�ӿ�
@FunctionalInterface
interface Printable {
    void print(String str);
}

class PrintableDemo{   //��ͨ��

    public void printUpper(String s, Printable pt) {
        pt.print(s);
    }
}

class StringUtils {
    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
}

//���������
public class LambdaDemo4 {

    public static void main(String[] args) {
        PrintableDemo pd=new PrintableDemo();
        StringUtils stu = new StringUtils();
        //ʹ�������ڲ��෽ʽ
        Printable p = new Printable() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        };
        pd.printUpper("HELLO",p);

        // ʹ��Lambda���ʽ��ʽ
        pd.printUpper("HELLO",(String str)->{
            System.out.println(str);
        });
        //ʹ��Lambda���ʽʡ�Ը�ʽ
        pd.printUpper("HELLO",(str -> System.out.println(str)));
        // ʹ��Lambda���ʽ�Ķ��������÷�����ʽ



    }


}