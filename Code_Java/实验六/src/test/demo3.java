package test;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 表格布局
 */
public class demo3 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		Button button1 = new Button("button1");
		Button button2 = new Button("button2");
		Button button3 = new Button("button3");
		Button button4 = new Button("button4");
		Button button5 = new Button("button5");

		//设置表格布局
		frame.setLayout(new GridLayout(3,2));
		frame.setBounds(200,200,300,300);

		//把按钮添加进去
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);

		//frame.pack(); //Java函数，作用：自动布局，选择一个最好的
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
