package BlockTest;

public class LeafTest {

}

class Root{
    static {
        System.out.println("ROot的静态初始化块");
    }
    {
        System.out.println("Root的普通初始化块");
    }
    public Root(){
        System.out.println("Root的无参构造器");
    }
}

class Mid extends Root{
    static {
        System.out.println("Mid的静态初始化块");
    }
    {
        System.out.println("Mid的普通初始化块");
    }
    public Mid(){
        System.out.println("Mid的无参构造器");
    }
    public Mid(String str){
        //通过this调用同一类中重载的构造器
        this();
        System.out.println("Mid带参构造器，其参数值："+str);
    }
}