public class test {
    public static void main(String[] args) {
        String s = "abvdefabcabcabc";
        System.out.println("length is "+s.length());
        System.out.println("thr fitst char;"+s.charAt(0));
        System.out.println("c is the first index"+s.indexOf('c'));
        System.out.println("c is the last index"+s.lastIndexOf('c'));
        System.out.println("the first"+s.indexOf("ab"));
        System.out.println("the last"+s.lastIndexOf("ab"));
    }
}
