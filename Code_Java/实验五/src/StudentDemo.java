public class StudentDemo {
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        s1.name="º÷¡·";
        s1.sex="≈Æ";
        s1.setAge(18);
        s2.name="‘¿‘∆≈Ù";
        s2.sex="ƒ–";
        s2.setAge(25);
        s1.showInfo();
        System.out.println("--------------");
        s2.toString();

    }
}
