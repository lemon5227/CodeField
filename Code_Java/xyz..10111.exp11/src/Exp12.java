public class Exp12 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("������������"+rt.availableProcessors()+"��");
        System.out.println("�����ڴ��С"+ rt.freeMemory()/1024/1024+"M");
        System.out.println("�������ڴ��С"+rt.maxMemory()/1024/1024+"M");
    }
}
