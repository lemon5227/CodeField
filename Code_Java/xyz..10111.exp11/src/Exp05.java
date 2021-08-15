public class Exp05 {
    public static void main(String[] args) {
        String s1 = "Starter";
        String s2 = "St";
        System.out.println("ÅĞ¶ÏÊÇ·ñÒÔ×Ö·û´®St¿ªÍ·:"+s1.startsWith("St"));
        System.out.println("ÅĞ¶ÏÊÇ·ñ×Ö·û´®½áÊøer£º"+s1.endsWith("er"));
        System.out.println("ÅĞ¶ÏÊÇ·ñ°üº¬×Ö·û´®ar:"+s1.contains("ar"));
        System.out.println("ÅĞ¶Ï×Ö·û´®ÊÇ·ñÎª¿Õ£º"+s1.isEmpty());
        System.out.println("ÅĞ¶Ï×Ö·û´®ÊÇ·ñÏàµÈ£º"+s1.equals(s2));
    }
}
