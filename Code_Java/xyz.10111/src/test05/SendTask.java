package test05;

/**
 * @author 闫文博
 */
public class SendTask {
    private String No;
    private  String weight;


    public  SendTask(){

    }
    public SendTask(String No,String weight){
        setNo(No);
        setWeight(weight);
    }
    public void  sendBefore(){
        System.out.println("订单开始处理，仓库验货中。。。");
        System.out.println("货物的重量："+weight);
        System.out.println("货物检验完成。");
        System.out.println("货物装车完成。");
        System.out.println("快递单号："+No);
    }
    void  send(Transportation t,GPS tools){
        System.out.println("运货人："+t.getAdmin()+"驾驶编号"+t.getNo()+"车辆型号"+t.getModel());
        t.transport();
        System.out.println("运货人："+t.getAdmin()+"驾驶编号"+t.getNo()+"车辆型号"+t.getModel()+"已归还");
        System.out.println(tools.showXY());
    }
    void sendAfter(Transportation t){
        System.out.println("货物运输任务已完成！");

    }
    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
