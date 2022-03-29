package exp1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("事件处理方式1示例");
		JPanel jp = new JPanel();
		JTextField jtf = new JTextField(15);
		JTextArea jta = new JTextArea(15,20);
		JButton btn = new JButton("数据转移");
		jp.add(jta);
		jp.add(jtf);
		jp.add(btn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = (String) jtf.getText().toString();
				jta.setText(str);
			}
		});
		jf.add(jp);
		jf.setBounds(200,400,400,200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
