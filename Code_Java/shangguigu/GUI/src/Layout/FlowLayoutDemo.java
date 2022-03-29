package Layout;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Java第四个GUI");
		JPanel jp1 = new JPanel();
		JButton btn1 = new JButton("1"); //创建按钮
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		jp1.add(btn1);
		jp1.add(btn2);
		jp1.add(btn3);
		jp1.add(btn4);
		jp1.add(btn5);
		jp1.add(btn6);
		jp1.add(btn7);
		jp1.add(btn8);
		jp1.add(btn9);
		jp1.setLayout(new FlowLayout());
		jp1.setBackground(Color.gray);
		jf.add(jp1);
		jf.setBounds(300,200,300,150);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
