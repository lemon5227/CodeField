public class Exo34 {
    public static void printAge(int age) throws Exception{
        if(age <=0){
            throw new Exception("����������󣬱���Ϊ������");
        }else {
            System.out.println("��������Ϊ��"+age);
        }
    }

    public static void main(String[] args) {
        int age = -1;
        try {
            printAge(age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
