package Person;

public class Student1 extends Person implements Comparable {
    private long number;
    private int  chinese;
    private int math;

    public Student1() {
        super();
    }

    public Student1(long number, int chinese, int math) {
        super();
        this.number = number;
        this.chinese = chinese;
        this.math = math;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "ѧ�ţ�"+number+"\t������"+getName()+"\t�Ա�"+getSex()+"\t���գ�"
                +String.format("%tY��%<tm��%<td��",getBirthday())+"\t���ģ�"+chinese+
                "\t��ѧ��"+math+"\tƽ����:"+(chinese+math)/2;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1(89,92,90);
        s2.setName("����");
        s2.setSex('Ů');
        System.out.println(s1.toString());
        System.out.println(s2.toString());


    }

    @Override
    public int compareTo(Object obj) {
        return 0;
    }
}
