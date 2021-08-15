package test05;

/**
 * @author 闫文博
 */
public class Actor implements Film,Sing,TelePlay {
    String name;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public void film() {
        System.out.println("我能演电影");
    }

    @Override
    public void sing() {
        System.out.println("我能唱歌");
    }

    @Override
    public void telePlay() {
        System.out.println("我能演电视剧");
    }
    public String show(){
        return "大家好，我是"+name;
    }
}
