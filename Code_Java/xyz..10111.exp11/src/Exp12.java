public class Exp12 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("处理器个数："+rt.availableProcessors()+"个");
        System.out.println("空闲内存大小"+ rt.freeMemory()/1024/1024+"M");
        System.out.println("最大可用内存大小"+rt.maxMemory()/1024/1024+"M");
    }
}
