package LIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo {
    /**
     *  集合元素遍历的5种方式
     *  4.使用jdk--forEach
     *      forEach(Consumer action)方法是JDK 8中新增加的遍历集合元素方法
     *  根据Lambda表达式特性，该方法所需要的参数是一个函数式接口
     *      list.forEach(Object o)->{System.out.println("迭代集合元素"+o)}
     *  lambda表达式的省略规则
     *      1.如果方法中只有一个参数，那么数据类型和小括号都可以省略
     *      2.如果方法中有多个参数，那么数据类型可以省略
     *      3.如果大括号中只有一行代码，那么大括号、return、分号都可以省略（三者必须一起省略）
     *  5.JDK 8中针对Iterator迭代器对象提供了一个forEachRemaining(Consumer action)方法来遍历
     *  该方法同样需要一个函数式接口
     */
    public static void main(String[] args) {
        List list = new ArrayList();

        //List接口的底层实现是数组，是一种变长的数组。

        list.add("hello");
        list.add("java");
        list.add("world");

        //原始的匿名内部类的格式
        list.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                String s = (String) o;
                System.out.println(s);
            }
        });

        //正常格式
        list.forEach((Object o)->{
            System.out.println(o);
        });

        //省略格式
        list.forEach(o-> System.out.println(o));


        //forEachRemaining方法
        Iterator iterator  = list.iterator();
        iterator.forEachRemaining(o-> System.out.println(o));
    }
}
