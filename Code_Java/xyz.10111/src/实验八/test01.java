package 实验八;

class Fu {
	int num = 100;

	public void show() {
		System.out.println("show Fu");
	}
}

class Zi extends Fu {
	int num = 1000;
	int num2 = 2000;

	@Override
	public void show() {
		System.out.println("show Zi");
	}

	public void method() {
		System.out.println("method Zi");
	}

}

public class test01 {
	public static void main(String[] args) {
		// 要有父类引用指向子类对象。
		// 父 f = new 子();
		Fu f = new Zi();
		System.out.println(f.num);
		// 找不到符号
		// System.out.println(f.num2);

		f.show();
//		f.method();

	}
}
