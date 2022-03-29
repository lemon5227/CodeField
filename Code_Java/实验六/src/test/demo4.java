package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 事件监听
 */
public class demo4 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		Button button = new Button("button");
		button.addActionListener(new MyAction());
		frame.setLayout(new BorderLayout());
		frame.add(button,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class MyAction implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("000");
	}
}