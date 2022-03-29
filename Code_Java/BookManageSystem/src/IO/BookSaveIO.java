package IO;

import services.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookSaveIO {
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static String USER = "root";
	public static String PASS = "yan2000926";

	public static int BookSave() throws ClassNotFoundException, SQLException {
		Book book = Book.getInstance();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		int Book_id = book.Book_id;
		String Book_name = book.Book_name;
		String Book_classify = book.classify;
		String sql = "INSERT INTO books(Book_id,Book_name,Book_classify) VALUES(?,?,?);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, String.valueOf(Book_id));
		ps.setString(2,Book_name);
		ps.setString(3,Book_classify);

		return ps.executeUpdate();
	}
}
