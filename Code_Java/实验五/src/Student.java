/**
 * @author 闫文博
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
        return "姓名='" + name + '\'' +
                ", 年龄=" + age+", 性别"+sex ;
    }
    public String showInfo(){
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +", 性别"+sex+
                '}';
    }
}
