package test07;

public class Computer {
    private Usb[] subarr =  new Usb[4];
    public void add(Usb usb){
        for(int i=0;i<4;i++){
            if(subarr[i]==null){
                subarr[i]=usb;
                break;
            }
        }
    }
    public void powerOn(){
        for(int i=0;i<4;i++){
            if(subarr[i]!=null){
                subarr[i].turnOn();
            }
        }
        System.out.println("电脑开机成功");
    }
}
