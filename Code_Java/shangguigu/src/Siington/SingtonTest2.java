package Siington;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * 懒汉式实现
 */
public class SingtonTest2 {
}

class Order{
    /**
     * 私有化构造器
     */
    private Order(){

    }

    /**
     * 声明当前类对象，没有初始化
     */
    private static Order instance = null;

    /**
     * 声明public static 的返回当前对象类的方法
     */

    public static Order getInstance(){
        if(instance == null){
            instance = new Order();
        }
        return instance;
    }
}