package Siington;

/**
 * 区别
 * 懒汉式： 好处 延迟对象的创建。坏处 线程不安全
 * 饿汉式： 坏处 对象加载时间长。 好处 线程安全
 */

public class SingtonTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
    }
}

/* 饿汉式 */

class Bank{
    /**
     * 1.私有化构造i去
     */
    private Bank(){

    }
    /**
     * 2.内部创建类的对象
     * 对象也必须是静态的
     */
    private  static Bank instance = new Bank();

    /**
     * 3.提供公共的静态方法，返回类的对象
     */
    public static Bank getInstance(){
        return instance;
    }
}