package IO;


import services.Student;

import java.sql.*;
import java.sql.ResultSet;

public class UserLoginIO {
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static String USER = "root";
	public static String PASS = "yan2000926";
	public static ResultSet ReturnUserData(String username, String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		PreparedStatement ps = null;
		String sql = "select * from student where username = ? and password = ?";
		ps=conn.prepareStatement(sql);
		ps.setString(1,username);
		ps.setString(2,password);
		ResultSet rs = ps.executeQuery();

		return rs;

	}

}
