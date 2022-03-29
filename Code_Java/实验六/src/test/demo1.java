package test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 流式布局
 */
public class demo1 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		//设置为流式布局
		//frame.setLayout(new FlowLayout());
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setBounds(200, 200, 300, 300);
		//把按钮添加进去
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}
}
