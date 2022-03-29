import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 一、集合框架的概述
 *  1.集合、数组是对多个数据进行存储的结构，简称Java容器
 *  说明：此时的存储，主要是指内存层面的存储，不涉及持久化存储（.txt,.jpj,数据库）
 *
 *  2.1数组在存储多个数据方面的特点：
 *      》一旦初始化一行，长度固定
 *      》数组一旦定义好，元素类型就决定了，只能操作指定类型的数据
 *  2.2数组在存储多个数据方面的缺点：
 *      》一旦初始化，当都不能改变
 *      》数组提供的方法非常有限，对于增删改查等操作，非常不便且效率不高
 *      》获取数组中元素的史记个数的需求，数组没有现成的属性或方法可以使用
 *      》数组存储数据的特点：有序、可重复、对于无序、不可重复的需求不能满足
 *
 *  二、集合框架
 *      |----Collection接口：单列集合，用来存储一个一个的对象
 *          |----List接口：存储有序、可重复的数据     --》“动态”数组
 *
 *          |----Set接口:存储无序的、不可重复的数据
 *
 *     |--Map接口：双列集合，用来存储一对（key,value）一对的数据  --》高中函数 y=f（x）
 *          |----HashMap、LinkedHashMap、TreeMap、HashTable、Properties
 *
 */
public class CollectionTest {
	public static void main(String[] args) {
		Collection coll = new ArrayList();

		coll.add("AA");
		coll.add(1230);//自动装箱

		System.out.println(coll);
		System.out.println(coll.isEmpty());

		Iterator iter = coll.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
