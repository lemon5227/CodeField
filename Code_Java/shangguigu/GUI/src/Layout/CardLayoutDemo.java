package Layout;

import javax.swing.*;
import java.awt.*;

public class CardLayoutDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame("Java 第五个GUI");
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel cards = new JPanel(new CardLayout()); //卡片式布局的面板
		p1.add(new JButton("登录按钮"));
		p1.add(new JButton("注册按钮"));
		p1.add(new JButton("找回密码按钮"));
		p2.add(new JTextField("用户文本框",20));
		p2.add(new JTextField("密码文本框",20));
		p2.add(new JTextField("验证码文本框",20));
		cards.add(p1,"card1"); //向卡片式布局面板中添加面板1
		cards.add(p2,"card2"); //向卡片式布局面板中添加面板2
		CardLayout c1 = (CardLayout)(cards.getLayout());
		c1.show(cards,"card2");
		jf.add(cards);
		jf.setBounds(300,200,400,200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
