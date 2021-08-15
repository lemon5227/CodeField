package Tamplate;

public class TamplateTest {
    public static void main(String[] args) {
        Tamplate t1 = new SubTamplate();
        t1.speedTime();
    }
}

abstract class Tamplate{
    public void speedTime(){
        long l = System.currentTimeMillis();

        code();

        long l1 = System.currentTimeMillis();

        System.out.println("the time is "+(l1-l));


    }
    public abstract void code();
}

class SubTamplate extends Tamplate{

    @Override
    public void code() {
        for(int i =2; i<=1000;i++){
            boolean isFlag = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i == j){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}
