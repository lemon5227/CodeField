/**
 * @author ���Ĳ�
 */
public class Student {
    public String name;
    private int age;
    public String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "����='" + name + '\'' +
                ", ����=" + age+", �Ա�"+sex ;
    }
    public String showInfo(){
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +", �Ա�"+sex+
                '}';
    }
}
