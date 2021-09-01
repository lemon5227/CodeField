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
        return "学号："+number+"\t姓名："+getName()+"\t性别："+getSex()+"\t生日："
                +String.format("%tY年%<tm月%<td日",getBirthday())+"\t语文："+chinese+
                "\t数学："+math+"\t平均分:"+(chinese+math)/2;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1(89,92,90);
        s2.setName("王五");
        s2.setSex('女');
        System.out.println(s1.toString());
        System.out.println(s2.toString());


    }

    @Override
    public int compareTo(Object obj) {
        return 0;
    }
}
