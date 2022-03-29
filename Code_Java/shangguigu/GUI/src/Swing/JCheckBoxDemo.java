package Swing;

import javax.swing.*;
import java.awt.*;

public class JCheckBoxDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Java复选组件示例");
		JPanel jp = new JPanel();
		JLabel label = new JLabel("流行编程语言有");
		label.setFont(new Font("楷体",Font.BOLD,16));
		JCheckBox jcb1 = new JCheckBox("C#",true);
		JCheckBox jcb2 = new JCheckBox("C++");
		JCheckBox jcb3 = new JCheckBox("Java");
		JCheckBox jcb4 = new JCheckBox("Python");
		JCheckBox jcb5 = new JCheckBox("PHP");
		JCheckBox jcb6 = new JCheckBox("Perl");
		jp.add(jcb1);
		jp.add(jcb2);
		jp.add(jcb3);
		jp.add(jcb4);
		jp.add(jcb5);
		jp.add(jcb6);
		jf.add(jp);
		jf.setBounds(200,400,400,100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
