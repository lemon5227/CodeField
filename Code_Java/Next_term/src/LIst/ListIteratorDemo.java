package LIst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    /**
     * 列表迭代器：
     *      ListIterator listIterator():List集合特有的迭代器
     *      该迭代器继承了Iterator迭代器，所以就可以直接使用hasNext和Next()方法
     *
     * 特有功能：
     *      Object previous():获取上一个元素
     *      Boolean hasPrevious():判断是否有元素
     *
     *      注意：LIstIterator可以实现双向遍历
     *      反向遍历迭代器：ListIterator listIterator(int index)
     */
    public static void main(String[] args) {
        List list = new ArrayList();

        //List接口的底层实现是数组，是一种变长的数组。

        list.add("hello");
        list.add("java");
        list.add("world");

        //反向遍历

        ListIterator listIterator1 = list.listIterator(list.size());
        while (listIterator1.hasPrevious()){
            String str = (String) listIterator1.previous();
            System.out.println(str);
        }
        //并发修改异常
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            String str = (String) iterator.next();
//            if(str.equals("world")){
//                list.add("javaee");
//            }
//        }
        //迭代器是依赖于集合存在的，在判断成功后，集合中新添加了元素，而迭代器却不知道，所以就报错了
        /**
         * 如何解决？
         *  A；迭代器迭代元素，迭代器修改元素
         *  B；普通for循环遍历元素，集合修改元素
         *          元素在最后添加
         */
        //方法一：迭代器迭代元素，迭代器修改元素
        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            String str = (String) iterator.next();
            if(str.equals("world")){
                iterator.add("javaee");
            }
        }

        //方法二：普通for循环遍历元素，集合修改元素
        for(int i=0;i< list.size();i++){
            String str = (String) list.get(i);
            if(str.equals("world")){
                list.add("javaee");
            }
        }

    }
}
