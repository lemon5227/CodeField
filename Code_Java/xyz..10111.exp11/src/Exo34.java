public class Exo34 {
    public static void printAge(int age) throws Exception{
        if(age <=0){
            throw new Exception("输入年龄错误，必须为正正数");
        }else {
            System.out.println("此人年龄为："+age);
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
