package Swing;

import javax.swing.*;

public class JComboBoxDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Java下拉列表组件示例");
		JPanel jp = new JPanel();
		JLabel label = new JLabel("证件类型");

		JComboBox cmb = new JComboBox();
		cmb.addItem("--请选择--");
		cmb.addItem("身份证");
		cmb.addItem("驾驶证");
		cmb.addItem("军官证");
		jp.add(label);
		jp.add(cmb);
		jf.add(jp);
		jf.setBounds(300,200,400,100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
