package IO;

import java.sql.*;

public class AdminLoginIO {
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static String USER = "root";
	public static String PASS = "yan2000926";
	public static ResultSet ReturnAdminData(String username, String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		PreparedStatement ps = null;
		String sql = "select * from admin where Admin_Username = ? and Admin_Passwd = ?";
		ps = conn.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2,password);
		ResultSet rs = ps.executeQuery();
		return  rs;
	}
}
