package Film;

public class Actor implements Film,Sing,TelePlay    {
    String name;

    public Actor(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("大家好，我是"+name+"!");
    }

    @Override
    public void film() {
        System.out.println("我能演电影！");
    }

    @Override
    public void sing() {
        System.out.println("我会唱歌！");
    }

    @Override
    public void teleplay() {
        System.out.println("我能演电视剧！");
    }
}
