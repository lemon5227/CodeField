package Interface;

/**
 * 接口的使用
 * 1.接口使用interface来定义
 * 2.java中，接口和类时并列的两个结构
 * 3.如何定义接口：定义接口中的成员
 *      3.1JDK7及以前：只能定义全局常量和抽象方法
 *      >全局常量：public static final的
 *      >抽象方法：public abstract的
 *      3.2JDK8: 除了定义全局变量和抽象方法之外，还可以定义静态方法、默认方法。
 * 4.接口不能定义构造器！意味着接口不能实例化
 *
 * 5.Java开发中，接口让类去实现（implements）的方法实现
 *      如果实现类覆盖了接口中的所以抽象方法，则实现类就可以实例化
 *      如果实现类没有覆盖接口中的所以抽象方法，则此实现类认为一个抽象类
 * 6.Java类可以实现多个接口 ----->弥补Java单继承性的局限
 *          class AA extends BB implements CC,DD,EE
 * 7.接口与接口之间可以继承，而且可以多继承
 */

public class InterfaceTest {

}

interface Flyable{
    /**
     *          全局常量
     *      第一宇宙速度，地球上最大速度
     */
    public static final int MAX_SPEED = 7900;
    /**
     * 省略了public static final，其实还是存在的
     */
    int MIN_SPEED = 1;

    /**
     *          抽象方法
     */

    public abstract void fly();

    /**
     * 省略public abstract
     */

    void stop();


}

class plane implements Flyable{

    /**
     * 抽象方法
     */
    @Override
    public void fly() {
        System.out.println("通过引擎起飞");

    }

    /**
     * 省略public abstract
     */
    @Override
    public void stop() {

    }
}
