import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * 1.自定义注解：
 *     ① 注解声明为interface
 *     ② 内部定义成员，通常使用value表示
 *     ③ 可以指定成员的默认值，使用default定义
 *     ④ 如果自定义注解没有成员，表明是一个标识作用
 *
 *  2.元注解：对现有注解进行解释说明的注解
 *      jdk5.0提供了四个元注解
 *      Retention：指定所修饰的Annotation的生命周期：SOURCE\CLASS(默认行为)\RUNTIME
 *          只有声明为RUNTIME声明周期的注解，才能通过反射获取
 *      Target：用于修饰Annotation定义，用于指定被修饰的Annotation能用于修饰哪些程序元素。@Target
 *          也包含一个名为value的成员变量
 *
 *      ****出现频率较低****
 *      Documented：表示所修饰的注解在被javadoc解释是，保留下来
 *      Inherited：被它修饰的Annotation将具有继承性。如果某个类使用了被@Inherited修饰的Annotation
 *          ,则其子类将自动具有该注解
 *   3.通过反射获取直接信息
 *   4.jdk8 中的新特性：可重复注解、类型注解
 *      可重复注解：① 在MyAnnotation上声明@Repeatable，成员值为MyAnnotations.class
 *               ② 在MyAnnotation的Target和Retention和MyAnnotations相同
 *      类型注解： ① ElementType.TYPE_PARAMETER 表示盖住是能写在类型变量的声明语句中（如：泛型声明）
 *               ② ElementType.TYPE_USE 表示该注解能写在使用类型的任何语句中
 */
@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)

@Target({TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE,TYPE_PARAMETER})
public @interface MyAnnotation {
	String value();
}
