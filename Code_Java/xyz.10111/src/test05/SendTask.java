package test05;

/**
 * @author ���Ĳ�
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
        System.out.println("������ʼ�����ֿ�����С�����");
        System.out.println("�����������"+weight);
        System.out.println("���������ɡ�");
        System.out.println("����װ����ɡ�");
        System.out.println("��ݵ��ţ�"+No);
    }
    void  send(Transportation t,GPS tools){
        System.out.println("�˻��ˣ�"+t.getAdmin()+"��ʻ���"+t.getNo()+"�����ͺ�"+t.getModel());
        t.transport();
        System.out.println("�˻��ˣ�"+t.getAdmin()+"��ʻ���"+t.getNo()+"�����ͺ�"+t.getModel()+"�ѹ黹");
        System.out.println(tools.showXY());
    }
    void sendAfter(Transportation t){
        System.out.println("����������������ɣ�");

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
