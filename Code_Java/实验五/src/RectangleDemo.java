
/**
 * @author 闫文博
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
        System.out.println("周长:"+r1.ZhouChang());
        System.out.println("面积:"+r1.area());
        System.out.println("-------------------");
        System.out.println(r2.toString());
        System.out.println("周长:"+r2.ZhouChang());
        System.out.println("面积："+r2.area());
    }
}
