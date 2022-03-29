package Swing;

import javax.swing.*;
import java.awt.*;

public class JButtondemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Java按钮组件示例");
		jf.setSize(400, 200);
		JPanel jp = new JPanel();
		JButton btn1 = new JButton("我是普通按钮");
		JButton btn2 = new JButton("我是带背景颜色按钮");
		JButton btn3 = new JButton("我是不可用按钮");
		JButton btn4 = new JButton("我是底部对齐按钮");
		jp.add(btn1);
		btn2.setBackground(Color.BLUE);
		jp.add(btn2);
		btn3.setEnabled(false);
		jp.add(btn3);
		Dimension preferredSize = new Dimension(160,60); //设置尺寸
		btn4.setPreferredSize(preferredSize); // 设置按钮大小
		btn4.setVerticalAlignment(SwingConstants.BOTTOM); // 设置按钮垂直对齐方式
		jp.add(btn4);
		jf.add(jp);
		jf.setBounds(300,200,600,300);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}