public class EmployeeDemo {
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setName("��ԲԲ");
        e1.setAge(18);
        e1.setSex("Ů");
        e1.setSal(29999.99);
        e2.setName("����ϼ");
        e2.setAge(35);
        e2.setSex("Ů");
        e2.setSal(89999.99);
        System.out.println(e1.toString());
        e1.Judge();
        System.out.println("-------------------");
        System.out.println(e2.toString());
        e2.Judge();
        return;
    }
}
