package Layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame("GridLayout布局计算器");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,4,5,5));
		panel.add(new JButton("7"));    //添加按钮
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		panel.add(new JButton("/"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("*"));
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("-"));
		panel.add(new JButton("0"));
		panel.add(new JButton("."));
		panel.add(new JButton("="));
		panel.add(new JButton("+"));
		jf.add(panel);
		jf.setBounds(300,200,200,150);
		jf.setVisible(true);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
