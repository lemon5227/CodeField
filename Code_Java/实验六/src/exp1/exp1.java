package exp1;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class exp1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("常用组件示例");
		JPanel jp = new JPanel();
		JLabel label = new JLabel("文本框：");
		JTextField jtf = new JTextField(30);
		JLabel label2 = new JLabel("按钮：");
		JButton btn = new JButton("确定");
		JLabel label3 = new JLabel("选择框");
		JCheckBox cb = new JCheckBox("喜欢音乐");
		JCheckBox cb2 = new JCheckBox("喜欢旅游");
		JCheckBox cb3 = new JCheckBox("喜欢体育");
		JLabel label4 = new JLabel("单选按钮:");
		JRadioButton rb1 = new JRadioButton("男");
		JRadioButton rb2 = new JRadioButton("女");
		ButtonGroup group = new ButtonGroup();
		group.add(rb1);
		group.add(rb2);
		JLabel label5 = new JLabel("下拉菜单:");
		JComboBox jcb = new JComboBox();
		jcb.addItem("美女图库");
		JLabel label6 = new JLabel("文本框：");
		JTextArea jta = new JTextArea(7,30);
		JLabel label7 = new JLabel("密码框");
		JTextField jtf2 = new JTextField(30);
		jp.add(label);
		jp.add(jtf);
		jp.add(label2);
		jp.add(btn);
		jp.add(label3);
		jp.add(cb);
		jp.add(cb2);
		jp.add(cb3);
		jp.add(label4);
		jp.add(rb1);
		jp.add(rb2);
		jp.add(label5);
		jp.add(jcb);
		jp.add(label6);
		jp.add(jta);
		jp.add(label7);
		jp.add(jtf2);
		jf.add(jp);
		jf.setBounds(200,400,400,400);
		jf.setVisible(true);
		//关闭事件
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
