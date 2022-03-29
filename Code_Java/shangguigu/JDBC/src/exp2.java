import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.*;

public class exp2 {
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static String USER = "root";
	public static String PASS = "yan2000926";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Connecting to database...");
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		System.out.println("Creating statement...");
		Statement stmt = conn.createStatement();
		String sql;
		sql = "SELECT username,passwd FROM user";
		ResultSet rs = stmt.executeQuery(sql);
		String[] Username = new String[10];
		String[] passwds = new String[10];
		int i =0;
		while (rs.next()){
			Username[i++] = rs.getString("username");
			passwds[i++] = rs.getString("passwd");
		}
		MyFrame myFrame = new MyFrame();
		myFrame.btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String inputUser = (String) myFrame.jtf.getText();
				String inputPasswd = (String) myFrame.jtf2.getText();
				if(Arrays.asList(Username).contains(inputUser) && Arrays.asList(passwds).contains(inputPasswd)){
					myFrame.label3.setText("欢迎登录");
					myFrame.c1.show(myFrame.cards,"card2");
				}else{
					myFrame.label3.setText("用户名或密码错误！");
					myFrame.c1.show(myFrame.cards,"card2");
				}
			}
		});
	}
}
class MyFrame extends JFrame {
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
	JLabel label3 = new JLabel();
	JButton button3 = new JButton("确定");
	CardLayout c1 = (CardLayout)(cards.getLayout());
	public MyFrame(){
		cards.add(jp,"card1");
		cards.add(jp1,"card2");
		c1.show(cards,"card1");
		jp.add(label1);
		jp.add(jtf);
		jp.add(label2);
		jp.add(jtf2);
		jp.add(btn1);
		jp.add(btn2);
		jp1.add(label3);
		jp1.add(button3);
		jf.add(cards);
		jf.setBounds(200,100,400,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
