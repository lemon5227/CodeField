package Film;

public class Actor implements Film,Sing,TelePlay    {
    String name;

    public Actor(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("��Һã�����"+name+"!");
    }

    @Override
    public void film() {
        System.out.println("�����ݵ�Ӱ��");
    }

    @Override
    public void sing() {
        System.out.println("�һᳪ�裡");
    }

    @Override
    public void teleplay() {
        System.out.println("�����ݵ��Ӿ磡");
    }
}
