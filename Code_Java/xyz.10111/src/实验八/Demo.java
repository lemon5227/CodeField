package ÊµÑé°Ë;

public class Demo {

	public static void main(String[] args) {
		Printer p = new BlackPrinter();
		p.print();
		System.out.println("-----------------------");
		p = new ColorPrinter();
		p.print();
	}

}
