import java.sql.*;

public class test {
	public static final String URL = "jdbc:mysql://localhost:3306/st";
	public static String USER = "root";
	public static String PASS = "yan2000926";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection conn = DriverManager.getConnection(URL,USER,PASS);
		PreparedStatement ps = null;
		String sql = "select * from Library where Book_name = ?";
		ps = conn.prepareStatement(sql);
		ps.setString(1, "雪中悍刀行");
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			System.out.println("111");
		}

	}
}