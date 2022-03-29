package IO;

import java.sql.*;

public class MineIO {
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static String USER = "root";
	public static String PASS = "yan2000926";
	public static ResultSet ReturnMineData(int stu_id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		PreparedStatement ps = null;
		String sql = "select * from lend_relationship where stu_id=?";
		ps=conn.prepareStatement(sql);
		ps.setInt(1,stu_id);
		ResultSet rs = ps.executeQuery();
		return rs;
	}
}
