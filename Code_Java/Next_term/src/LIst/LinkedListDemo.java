package LIst;

import java.util.LinkedList;

public class LinkedListDemo {
    /**
     * ArrayList：
     *      底层是数组，查询快，增删慢。
     *      线程不安全，效率高
     * Vector:
     *      底层是数组，查询快，增删慢
     *      线程不安全，效率高。就是线程安全的arraylist
     *  LinkedList:
     *      底层是链表，查询慢，增删快
     *      线程不安全，效率高
     */
    public static void main(String[] args) {
        /**
         * LinkedList的特有功能：
         *      A；添加功能
         *          public void addFirst(Object e)
         *          public void addLast(Object e)
         *      B:获取功能
         *          public void getFirst(Object e)
         *          public void getLast(Object e)
         *      C：删除功能
         *          public void removeFirst(Object e)
         *          public void removeLast(Object e)
         */
        LinkedList list = new LinkedList();
        list.add("hello");
        list.add("java");
        list.add("world");

        list.addFirst("javaee");
        list.addLast("安卓");
        list.forEach(o-> System.out.println(o));
        System.out.println("------------");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("----------");

        list.removeFirst();
        list.removeLast();

        list.forEach(o -> System.out.println(o));
    }
}
