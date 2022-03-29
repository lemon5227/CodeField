public class TeacherThead implements Runnable{
	public static int homeworks = 1;
	@Override
	public void run() {
		while (true) {
			if(homeworks <=40){
				System.out.println(Thread.currentThread().getName() + "正在发第"+homeworks+"份学习笔记");
				homeworks++;
			}else {
				break;
			}
		}
	}
}
