public class EmployeeDemo {
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.setName("高圆圆");
        e1.setAge(18);
        e1.setSex("女");
        e1.setSal(29999.99);
        e2.setName("林青霞");
        e2.setAge(35);
        e2.setSex("女");
        e2.setSal(89999.99);
        System.out.println(e1.toString());
        e1.Judge();
        System.out.println("-------------------");
        System.out.println(e2.toString());
        e2.Judge();
        return;
    }
}
