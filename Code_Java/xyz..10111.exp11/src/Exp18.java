public class Exp18 {
    public static void main(String[] args) {
        int num = 123;
        //1.通过String.valueOf()方法将基本数据类转换为字符串
        String string = String.valueOf(num);
        System.out.println("int--->字符串；"+string);
        //2.通过包装类的valueOf()静态方法将基本数据类型和字符串转换为包装类
        String str = "998";
        Integer integer = Integer.valueOf(num);
        Integer integer2 = Integer.valueOf(str);
        System.out.println("int--->包装类"+integer);
        System.out.println("字符串---->包装类"+integer2);
        //3.通过包装类有参构造方法将基本数据类型和字符串转换为包装类
        Integer integer3 = new Integer(num);
        Integer integer4 = new Integer(str);
        System.out.println("构造器int--->包装类"+integer3);
        System.out.println("构造器字符串--->包装类"+integer4);
        //4.通过包装类的parseXXX()静态方法将字符串转换为基本数据类型
        int parseInt = Integer.parseInt(str);
        System.out.println("字符串转换为基本数据类型"+parseInt);
        //5.通过包装类的toString()方法将包装类转换为字符串
        String string2 = integer.toString();
        System.out.println("包装类转换为字符串"+string2);
    }
}
