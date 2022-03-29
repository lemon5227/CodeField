import java.sql.*;
public class demo1 {
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
		String sql1 = "insert into user(username,passwd) values('root','123456')";
		String sql2 = "";
		int rs2 = stmt.executeUpdate(sql1);
		if(rs2 != 0){
			System.out.println("插入成功！");
		}
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()){
			System.out.println("用户名："+rs.getString("username")+" 密码："+rs.getString("passwd"));
		}
	}
}
