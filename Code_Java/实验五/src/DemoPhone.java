public class DemoPhone {
    public static void main(String[] args){
        Phone p1 =new Phone();
        System.out.println(p1.getBand()+"--"+ p1.getPrice()+"--"+ p1.getColor());
        System.out.println("----------------");
        p1.setBand("华为");
        p1.setPrice(3888);
        p1.setColor("土豪金");
        System.out.println(p1.getBand()+"--"+ p1.getPrice()+"--"+ p1.getColor());
        System.out.println("----------------");
        System.out.println(p1.toString());
    }
}
