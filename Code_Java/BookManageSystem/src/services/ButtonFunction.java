package services;

import IO.UserLoginIO;

import java.sql.ResultSet;
import java.sql.SQLException;

import static IO.AdminLoginIO.ReturnAdminData;
import static IO.MineIO.ReturnMineData;

public class ButtonFunction {
	public static int UserCheck(String username,String passwd) throws SQLException, ClassNotFoundException {
		ResultSet rs = UserLoginIO.ReturnUserData(username,passwd);

		if(rs.next()) {
			System.out.println(rs.getInt(1));
			return rs.getInt("id");
		}
		return 0;
	}

	public static  int AdminCheck(String username,String password) throws SQLException, ClassNotFoundException {
		ResultSet rs = ReturnAdminData(username,password);
		if(rs.next()) {
			System.out.println(rs.getInt(1));
			return rs.getInt(1);
		}
		return 0;
	}

	public static Student ReturnStudentData(int stu_id) throws SQLException, ClassNotFoundException {
		ResultSet rs = ReturnMineData(stu_id);

		while (rs.next()) {
			String name = rs.getString("name");
			int age = rs.getInt("age");
			int lendBooks = rs.getInt(4);
			Student student = new Student(name, age, lendBooks);
			return student;
		}
		return null;
	}
}
