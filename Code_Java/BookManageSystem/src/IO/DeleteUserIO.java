package IO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteUserIO {
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static String USER = "root";
	public static String PASS = "yan2000926";

	public static int DeleteUser(int Stu_id) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		String sql = "DELETE FROM student where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		int row=ps.executeUpdate();
		if(row!=0){
			return 1;
		}else{
			return 0;
		}

	}
}
