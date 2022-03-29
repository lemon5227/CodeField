package Swing;

import javax.swing.*;

public class JLabelDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Java标签组件示例");
		JPanel jp = new JPanel();
		JLabel label1 = new JLabel("普通标签");
		JLabel label2 = new JLabel();
		label2.setText("调用setText()方法");
		ImageIcon icon1 = new ImageIcon("D:\\app.svg");

		//创建既含有文本又含有图标的Jlabel
		JLabel label3 = new JLabel("开始理财",icon1,JLabel.CENTER);
		jp.add(label1);
		jp.add(label2);
		jp.add(label3);
		jf.add(jp);
		jf.setBounds(300,200,400,100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
