package Swing;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonDemo {
	public static void main(String[] args) {
		JFrame  jf = new JFrame("Java单选组件示例");
		JPanel jp = new JPanel();
		JLabel label = new JLabel("现在是哪个季节");
		JRadioButton rb1 = new JRadioButton("春天");
		JRadioButton rb2 = new JRadioButton("夏天");
		JRadioButton rb3 = new JRadioButton("秋天",true);
		JRadioButton rb4 = new JRadioButton("冬天");
		label.setFont(new Font("楷体",Font.BOLD,16));
		jp.add(label);
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		group.add(rb3);
		group.add(rb4);
		jp.add(rb1);
		jp.add(rb2);
		jp.add(rb3);
		jp.add(rb4);
		jf.add(jp);
		jf.setBounds(300,200,400,100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
