import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class LoginDemo2 {
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static String USER = "root";
	public static String PASS = "yan2000926";

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			try {
				createAndShowGUI();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		});

	}
	public static void createAndShowGUI() throws SQLException {
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
		//添加事件处理代码
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String sql = "select * from user where username =? and passwd =?";
				try {
					PreparedStatement ps = conn.prepareStatement(sql);
					String inputUser = (String) txtUser.getText();
					String inputpasswd =  String.valueOf(pwfPsd.getPassword());
					ps.setString(1,inputUser);
					ps.setString(2,inputpasswd);
					ResultSet rs = ps.executeQuery();
					while (rs.next()){
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