package test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 东西南北中
 */
public class demo2 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		Button button4 = new Button("button4");
		Button button5 = new Button("button5");
		//设置为东西南北中布局
		frame.setLayout(new BorderLayout());
		frame.setBounds(200, 200, 300, 300);
		//把按钮添加进去
		frame.add(button1, BorderLayout.EAST);
		frame.add(button2,BorderLayout.WEST);
		frame.add(button3,BorderLayout.SOUTH);
		frame.add(button4,BorderLayout.NORTH);
		frame.add(button5,BorderLayout.CENTER);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});
	}
}
