package Swing;

import javax.swing.*;
import java.awt.*;

public class JTextFieldDemo {
	public static void main(String[] args) {
		JFrame jf= new JFrame("Java文本框示例");
		JPanel jp = new JPanel();
		JTextField jtf1 = new JTextField();
		jtf1.setText("普通文本框");
		JTextField jtf2 = new JTextField();
		jtf2.setFont(new Font("楷体",Font.BOLD,16));
		jtf2.setText("指定长度和字体的的文本里");
		JTextField jtf3 = new JTextField(30);
		jtf3.setText("居中对齐");
		jtf3.setHorizontalAlignment(JTextField.CENTER);
		jp.add(jtf1);
		jp.add(jtf2);
		jp.add(jtf3);
		jf.add(jp);
		jf.setBounds(300,200,400,100);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
