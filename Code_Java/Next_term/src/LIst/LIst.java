package LIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * 集合元素遍历的5种方式
 * 1.普通for循环配合List接口的size()和get(index i)方法
 * 2.使用Iterator迭代器对象
 * 遍历集合
 *      a:通过集合对象获取迭代器对象
 *      b:通过迭代器对象的hasNext()方法判断有没有元素
 *      c:通过迭代器对象的next（）方法获取元素并移动到下一个元素位置
 *  3.增强for
 */
public class LIst {
    public static void main(String[] args) {
        List list = new ArrayList();

        //List接口的底层实现是数组，是一种变长的数组。

        list.add("hello");
        list.add("java");
        list.add("world");

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            System.out.println(str);
        }
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            System.out.println(str);
        }

        /**
         * 增强for:是for循环的一种，本质上是迭代器
         * 格式：
         *      for（元素数据类型 变量 ：数组或collection集合）{
         *          使用变量即可，该变量就是元素
         *      }
         */

        System.out.println("---增强for---");
        for (Object o : list) {
            String s = (String) o;
            System.out.println(s);
        }
    }
}
