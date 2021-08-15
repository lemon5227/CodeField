package exp10;

//�����вΡ��з���ֵ�ĺ���ʽ�ӿ�
@FunctionalInterface
interface Calculate {
    int sum(int a, int b);
}

class CalculateDemo {
    // ����һ����͵ķ���������������int�����Լ��ӿ�Calculate���͵Ĳ���
    public void add(int num1, int num2, Calculate calculate) {
        int result = calculate.sum(num1, num2);
        System.out.println(num1 + "+" + num2 + "�ĺ�Ϊ��" + result);
    }
}

public class LambdaDemo2 {

    public static void main(String[] args) {
        CalculateDemo cd = new CalculateDemo();

        // �����ڲ��෽ʽ
        Calculate cal = new Calculate() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        cd.add(10,20,cal);


        // Lambda���ʽ��ʽ:
        cd.add(10,20,(int a, int b)->{
            return a+b;
        });

        // Lambda���ʽʡ�Է�ʽ:
        cd.add(10,20,(a,b)->a+b);

    }

}