
/**
 * @author ���Ĳ�
 */
public class RectangleDemo {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.setHeight(8);
        r1.setWidth(10);
        r2.setHeight(9);
        r2.setWidth(12);
        System.out.println(r1.toString());
        System.out.println("�ܳ�:"+r1.ZhouChang());
        System.out.println("���:"+r1.area());
        System.out.println("-------------------");
        System.out.println(r2.toString());
        System.out.println("�ܳ�:"+r2.ZhouChang());
        System.out.println("�����"+r2.area());
    }
}
