package exp1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class exp5 {
	public static void main(String[] args) {
		String Username ="root";
		String Passwd = "password";
		JFrame jf = new JFrame("登录");
		JPanel jp = new JPanel();
		JPanel jp1 = new JPanel();
		JPanel cards = new JPanel(new CardLayout());
		JLabel label1 = new JLabel("用户名");
		JLabel label2 = new JLabel("密 码");
		JButton btn1 = new JButton("登录");
		JButton btn2 = new JButton("登出");
		JTextField jtf = new JTextField(15);
		JTextField jtf2 = new JTextField(15);
		cards.add(jp,"card1");
		cards.add(jp1,"card2");
		JLabel label3 = new JLabel();
		JButton button3 = new JButton("确定");
		CardLayout c1 = (CardLayout)(cards.getLayout());
		c1.show(cards,"card1");
		jp.add(label1);
		jp.add(jtf);
		jp.add(label2);
		jp.add(jtf2);
		jp.add(btn1);
		jp.add(btn2);
		jp1.add(label3);
		jp1.add(button3);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String inputUser = (String) jtf.getText();
				String inputPasswd = (String) jtf2.getText();
				if(Username.equals(inputUser) && Passwd.equals(inputPasswd)){
					label3.setText("欢迎登录");
					c1.show(cards,"card2");
				}else{
					label3.setText("用户名或密码错误！");
					c1.show(cards,"card2");
				}
			}
		});
		jf.add(cards);
		jf.setBounds(200,100,400,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
