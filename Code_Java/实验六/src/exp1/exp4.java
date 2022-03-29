package exp1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class exp4 {
	static int number = 0;
	public static void main(String[] args) {
		JFrame jf = new JFrame("猜数");
		JPanel jp = new JPanel();
		JButton btn = new JButton("获取一个随机数");
		JLabel label = new JLabel("输入您猜的数组（1-100）");
		JTextField jtf = new JTextField(10);
		label.setBackground(Color.green);
		JButton btn2 = new JButton("确定");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setEnabled(false);
				number = (int)(Math.random()*100+1);
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String MyNumber = (String)(jtf.getText());
				int MyNUmber = Integer.parseInt(MyNumber);
				if (MyNUmber > number){
					label.setText("对不起，您猜的大了");
				}else if(MyNUmber < number){
					label.setText("对不起，您猜的小了");
				}else {
					label.setText("恭喜恭喜，您猜中了!");
				}
			}
		});

		jp.add(btn);
		jp.add(label);
		jp.add(jtf);
		jp.add(btn2);
		jf.add(jp);
		jf.setBounds(200,400,400,
				400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
