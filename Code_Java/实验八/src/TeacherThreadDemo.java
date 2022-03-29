public class TeacherThreadDemo {
	public static void main(String[] args) {
		TeacherThead teacherThead = new TeacherThead();
		Thread t1 = new Thread(teacherThead);
		Thread t2 = new Thread(teacherThead);
		Thread t3 = new Thread(teacherThead);

		t1.setName("刘老师");
		t2.setName("叶老师");
		t3.setName("张老师");
		t1.start();
		t2.start();
		t3.start();
	}
}
