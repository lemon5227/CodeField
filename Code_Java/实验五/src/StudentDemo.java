public class StudentDemo {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        s1.name="����";
        s1.sex="Ů";
        s1.setAge(18);
        s2.name="������";
        s2.sex="��";
        s2.setAge(25);
        s1.showInfo();
        System.out.println("--------------");
        s2.toString();

    }
}
