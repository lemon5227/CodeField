package services;

import java.sql.Date;

public class LendRelationship {
	public int stu_id;
	public int Book_id;
	public String Book_name;
	public String stu_name;
	public Date date;
	static LendRelationship lendRelationship = new LendRelationship();

	public LendRelationship(){

	}

	public LendRelationship( int stu_id, int book_id, String book_name, String stu_name, Date date) {
		this.stu_id = stu_id;
		Book_id = book_id;
		Book_name = book_name;
		this.stu_name = stu_name;
		this.date = date;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	public static LendRelationship getInstance() {
		return lendRelationship;
	}
}
