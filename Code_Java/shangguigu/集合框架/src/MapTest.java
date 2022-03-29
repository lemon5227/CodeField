import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * |--Map接口：双列集合，用来存储一对（key,value）一对的数据  --》高中函数 y=f（x）
 *      |----HashMap：作为Map的主要实现类：线程不安全，效率高，可以存储null的key和value
 *          |----LinkedHashMap：保证遍历map元素时，可以安装添加的顺序实现遍历
 *              原因：在原有的HashMap基础上，添加了一对指针
 *      |----TreeMap：按照添加的键值对进行排序，考虑key的自然排序和定制排序
 *                  底层使用红黑树
 *      |----HashTable：作为Map的古老实现类：线程安全，效率低，不能存储null的key和value
 *          |----Properties：常用来处理配置文件，key和value都是String类型
 *
 *      HashMap的底层：数组和链表 jdk7及之前
 *                   数组和链表和红黑树 jdk8
 *     二、Map结构的理解
 *      Map中的key：无序的、不可重复的，使用Set存储所有的key
 *      Map中的value：无序的、可重复的，使用Collection存储所有的value
 *      一个键值对：Key-value构成一个Entry对象
 *      Map中的Entry：无序的、不可重复的，使用Set存储所有的entery
 *
 *      三、HashMap的底层实现，jdk7
 *          HashMap map= new HashMap();
 *          在实例化后，底层创建了长度为16的一维数组Entry[] table
 *          map.put(key1,value1)
 *          首先计算Key1的hash值，hash值经过计算后，得到Entry数组中的存放位置
 *          如果此位置上的数据为空，此时添加成功
 *          如果不会空，（意味着此位置上存在一个或多个数据（以链表形式存在）），比较key1和已经存在的一个或多个数据、
 *          的哈希值：
 *              如果key1的哈希值与已经存在的数据哈希值都不相同，此时数据添加成功
 *              如果key1的哈希值与已经存在的数据哈希值相同，继续比较，调用key1所在类的equals（key2）方法
 *                  如果不相同，添加成功
 *                  如果相同，使用value1替换value2
 *        jdk8，相较于jdk7底层实现的不同：
 *          1.new HashMap()：底层没有创建一个长度为16的数组
            2.jdk8底层的数组是：Node[],而非Entry[]
            3.首次调用put()方法时，底层创建长度为16的数组
            4.当数组某一个索引位置上的元素个数以链表形式存在的个数 > 8 且当前数组的长度 >64时，
            此时索引位置上的所有数据改为红黑树存储

            HashMap 默认长度是16 加载因子是0.75 临界大小是12
            ----532看源码----
 */
public class MapTest {
	@Test
	public void test1(){
		Map map = new LinkedHashMap();

		map.put(null,12);
	}
}
