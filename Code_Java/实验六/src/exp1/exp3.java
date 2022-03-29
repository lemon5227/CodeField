package exp1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class exp3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("适配器设计模式示例2");
		JPanel jp = new JPanel();
		JButton btn1 = new JButton("红色");
		JButton btn2 = new JButton("绿色");
		JButton btn3 = new JButton("蓝色");
		btn1.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				jp.setBackground(Color.RED);
			}

			public void focusLost(FocusEvent e) {

			}
		});
		btn2.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				jp.setBackground(Color.GREEN);
			}

			@Override
			public void focusLost(FocusEvent e) {

			}
		});
		btn3.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				jp.setBackground(Color.BLUE);
			}

			@Override
			public void focusLost(FocusEvent e) {

			}
		});
		jp.add(btn1);
		jp.add(btn2);
		jp.add(btn3);
		jf.add(jp);
		jf.setBounds(200,400,400,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
