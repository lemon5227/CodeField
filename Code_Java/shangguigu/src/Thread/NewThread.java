package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 创建线程的方式三：实现Callable接口。---JDk5.0新增
 * Future接口
 *  1.可以对具体的Runable、Callable任务的执行结果进行取消、查询是否完成、获取结果等
 *  2.FutTask是Futu接口的唯一实现类
 *  3.FutureTask同时实现了Runnable，Future接口。它既可以作为Runnable被线程执行，由于可以作为
 *  Future得到Callable的返回值
 */
//1.创建一个实现Callable类的实现类
class NumThread implements Callable {
	//2.实现call（)方法，将此线程需要执行的操作声明在call（）中
	@Override
	public Object call() throws Exception {
		int sum = 0;
		for (int i = 0; i <100 ; i++) {
			if(i%2==0){
				System.out.println(i);
				sum += i;
			}
		}
		return sum;
	}
}
public class NewThread {
	public static void main(String[] args) {
		//3.创建Callable接口实现类的对象

		NumThread numThread = new NumThread();
		//4.将此Callable接口实现类的对象作为传递到FutureTask构造器中，创建FutureTask的对象
		FutureTask futureTask = new FutureTask(numThread);
		//5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start（）
		new Thread(futureTask).start();



		try {
			//get()返回值即为FutureTask构造器参数Callable返回结果
			Object sum = futureTask.get();
			System.out.println("总和为:"+sum);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
}
