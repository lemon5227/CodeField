
public class ManagerDemo {
    public static void main(String[] args){
        Manager e1 = new Manager();
        Manager e2 = new Manager();
        e1.setName("١���");
        e1.setAge(18);
        e1.setSex("Ů");
        e1.setSal(29999.99);
        e2.setName("������");
        e2.setAge(35);
        e2.setSex("��");
        e2.setSal(89999.99);
        System.out.println(e1.toString());
        e1.Judge();
        System.out.println("-------------------");
        System.out.println(e2.toString());
        e2.Judge();
        return;
    }
}
