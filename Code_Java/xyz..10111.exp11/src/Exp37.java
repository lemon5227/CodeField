public class Exp37 {
    public static void recycle(){
        Person12 p1 = new Person12();
        p1 = null;
        int i=1;
        while (i<10){
            System.out.println("方法一循环");
            i++;
        }
    }
    public static void recycle2(){
        Person12 p2 = new Person12();
        p2 = null;
        System.gc();
        int i=1;
        while (i<=10){
            System.out.println("方法二循环中");
            i++;
        }
    }

    public static void main(String[] args) {
        recycle();
        System.out.println("========");
        recycle2();
    }
}

class Person12{
    @Override
    public void finalize(){
        System.out.println("将对象作为垃圾回收...");
    }
}