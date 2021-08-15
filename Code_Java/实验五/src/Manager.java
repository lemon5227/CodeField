public class Manager {
    String name;
    int age;
    String sex;
    double sal;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", sal=" + sal +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getSal() {
        return sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public void Judge(){
        if(age<40){
            System.out.println(name+"¼Ó°à£¡");
        }
        else {
            System.out.println(name+"ÀÏÁË£¬´ÇÍË£¡");
        }
    }
}
