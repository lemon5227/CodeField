package IO;

import services.LendRelationship;

import java.sql.*;

public class LendRelationshipIO {
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static String USER = "root";
	public static String PASS = "yan2000926";

	public static int SaveLendRelationship() throws SQLException, ClassNotFoundException {
		LendRelationship lendRelationship = LendRelationship.getInstance();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		int stu_id = lendRelationship.stu_id;
		int Book_id = lendRelationship.Book_id;
		String Book_name = lendRelationship.Book_name;
		String stu_name = lendRelationship.stu_name;
		String date = lendRelationship.date.toString();

		String sql = "INSERT INTO lendbook(stu_id,Book_id,Book_name,name,lenddate) VALUES(?,?,?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, String.valueOf(stu_id));
		ps.setString(2, String.valueOf(Book_id));
		ps.setString(3,Book_name);
		ps.setString(4,stu_name);
		ps.setString(5,date);


		return ps.executeUpdate();

	}
}
