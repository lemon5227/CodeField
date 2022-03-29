package exp4;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book {
	int id;
	String name;
	double price;
	Calendar date;

	public Book(int id, String name, double price, Calendar date) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.date = date;
	}
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
	@Override
	public String toString() {
		return id+"\t"+ name + "\t" + price + "\t" + sdf.format(date.getTime());
	}
}
