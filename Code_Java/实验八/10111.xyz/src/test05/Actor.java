package test05;

/**
 * @author ���Ĳ�
 */
public class Actor implements Film,Sing,TelePlay {
    String name;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public void film() {
        System.out.println("�����ݵ�Ӱ");
    }

    @Override
    public void sing() {
        System.out.println("���ܳ���");
    }

    @Override
    public void telePlay() {
        System.out.println("�����ݵ��Ӿ�");
    }
    public String show(){
        return "��Һã�����"+name;
    }
}
