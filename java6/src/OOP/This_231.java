package OOP;
//this���ù�����
//����ͨ��this(�β��б�)����ʽ�ĵ�������������
//����ͬthis���β��б������Լ�
//
public class This_231 {
    public static void main(String[] args) {

    }
}
class Person{
    int age;
    String name;

    public Person(){
        //40�д���
    }
    public Person(int n){
        this();//����ͨ�����������Ǹ���������ʡ��40�д���
    }
}