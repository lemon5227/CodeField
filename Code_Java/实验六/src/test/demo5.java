package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 文本框的监听
 */
public class demo5 {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}
}

class MyFrame extends Frame {
	public MyFrame(){
		TextField tf = new TextField();
		add(tf);

		//监听这个文本框的文字，按下enter就会触发事件
		tf.addActionListener(new MyActionListener());

		//设置替换编码，隐藏输入内容
		tf.setEchoChar('*');
		setVisible(true);
		pack();

	}
}

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		TextField source = (TextField) e.getSource(); //获得资源，返回一个对象
		System.out.println(source.getText());
		source.setText("");
	}
}