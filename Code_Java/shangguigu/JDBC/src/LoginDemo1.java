/*
 * 
SQL注入式攻击：就是输入域或页面请求的查询字符串，欺骗服务器执行恶意的SQL命令。
	两种攻击方案：
		方案1：密码框输入：1' or '1'='1        用户名框输入任意字符
		方案2：用户名框输入：1' or 1=1;#      密码框输入任意字符
		都可以成功进行SQL注入式攻击。
	分析：用户名框直接输入：1' or '1'='1   是不成功的，因为后面要有逻辑与判断。
	防SQL注入式攻击：使用PreparedStatement子接口

 */
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoginDemo1 {
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static String USER = "root";
	public static String PASS = "yan2000926";

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			try {
				createAndShowGUI();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});

	}
	public static void createAndShowGUI() throws ClassNotFoundException, SQLException {
		JFrame f=new JFrame();
		f.setTitle("登录");
		f.setSize(210, 170);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		//布局管理器
		FlowLayout layout=new FlowLayout();
		layout.setVgap(12);
		f.setLayout(layout);
		//添加组件
		JLabel lblUser=new JLabel("用户名：");
		JLabel lblPsd=new JLabel("密    码：");
		JTextField txtUser=new JTextField(10);
		JPasswordField pwfPsd=new JPasswordField(10);
		JButton btnLogin=new JButton("登录");
		JButton btnExit=new JButton("退出");
		f.add(lblUser);
		f.add(txtUser);
		f.add(lblPsd);
		f.add(pwfPsd);
		JPanel panel=new JPanel();
		FlowLayout layout2=new FlowLayout();
		panel.setLayout(layout2);
		layout2.setHgap(30);
		f.add(panel);
		panel.add(btnLogin);
		panel.add(btnExit);
		//添加组件
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Connecting to database...");
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		System.out.println("Creating statement...");
		Statement stmt = conn.createStatement();
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String inputUser = (String) txtUser.getText();
				String inputpasswd =  String.valueOf(pwfPsd.getPassword());
				String sql = "SELECT username,passwd,sex FROM user where username= '"+inputUser+"' and passwd='"+inputpasswd+"'";
				System.out.println(sql);
				try {
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						JOptionPane.showMessageDialog(null,"登录成功");
					}
				} catch (SQLException ex) {
					ex.printStackTrace();
				}

			}
		});


		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}