package Person;

public class Student extends Person {
    private long number;
    private int  chinese;
    private int math;

    public Student() {
        super();
    }

    public Student(long number, int chinese, int math) {
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
        Student s1 = new Student();
        Student s2 = new Student(89,92,90);
        s2.setName("����");
        s2.setSex('Ů');
        System.out.println(s1.toString());
        System.out.println(s2.toString());


    }
}
