package services;

/**
 * 书籍类
 * @description
 * 用于管理员存入书籍进入数据库
 */
public class Book {
	public int Book_id;
	public String Book_name;
	public String classify;
	static Book book = new Book();
	Book(){

	}

	public Book(int book_id, String book_name, String classify) {
		Book_id = book_id;
		Book_name = book_name;
		this.classify = classify;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public  static Book getInstance(){
		return book;
	}
}
