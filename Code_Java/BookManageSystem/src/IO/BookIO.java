package IO;

import java.sql.*;

public class BookIO {
	public static final String URL = "jdbc:mysql://localhost:3306/test";
	public static String USER = "root";
	public static String PASS = "yan2000926";


	public static String [][] ReturnBooksData() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		String sql = "select * from books";
		PreparedStatement ps = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = ps.executeQuery();




		rs.last();//游标移动到查询到的数据库数据记录的最后一条
		int row=rs.getRow();//获取记录的总条数
		rs.beforeFirst();//游标回到第一个记录前的位置
		String comm[][] = new String[row][3];

		rs.next();
		for(int i =0;i<row; i++){

			comm[i][0]=rs.getString("Book_id");
			comm[i][1]=rs.getString("Book_name");
			comm[i][2]=rs.getString("Book_classify");
			rs.next();
		}

		return comm;
	}
	public static String [][] ReturnBooksData(String name) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(URL, USER, PASS);
		String sql = "select * from books where Book_name=?";
		PreparedStatement ps = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ps.setString(1,name);
		ResultSet rs = ps.executeQuery();


		rs.last();//游标移动到查询到的数据库数据记录的最后一条
		int row=rs.getRow();//获取记录的总条数
		rs.beforeFirst();//游标回到第一个记录前的位置
		String comm[][] = new String[row][3];

		rs.next();
		for (int i = 0; i < row; i++){

			comm[i][0]=rs.getString("Book_id");
			comm[i][1]=rs.getString("Book_name");
			comm[i][2]=rs.getString("Book_classify");
			rs.next();
		}

		return comm;
	}

}
