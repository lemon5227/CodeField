package OOP;

//����һ������ʽ�ӿ�
@FunctionalInterface
interface Printable {
    void print(StringUtils su, String str);
}

//����һ����ͨ��PrintableDemo
class PrintableDemo {
    public void printUpper(StringUtils su, String s, Printable pt) {
        pt.print(su, s);
    }
}

//����һ��StringUtils�࣬������һ����Ա����printUpperCase(String str)
class StringUtils {
    public void printUpperCase(String str) {
        System.out.println(str.toUpperCase());
    }
}

//���������
public class LambdaDemo6 {
    public static void main(String[] args) {
        PrintableDemo pd = new PrintableDemo();
        StringUtils su = new StringUtils();
        //ʹ�������ڲ��෽ʽ
        Printable p = new Printable() {
            @Override
            public void print(StringUtils su, String str) {
                su.printUpperCase(str);
            }
        };
        pd.printUpper(su, "HELLO", p);

        // ʹ��Lambda���ʽ��ʽ
        pd.printUpper(su,"HELLO",(StringUtils s, String str)-> s.printUpperCase(str));
        //ʹ��Lambda���ʽʡ�Ը�ʽ
        pd.printUpper(su,"HELLO",(s,str)->s.printUpperCase(str));

        // ʹ��Lambda���ʽ������������ͨ������ʽ

    }
    }
