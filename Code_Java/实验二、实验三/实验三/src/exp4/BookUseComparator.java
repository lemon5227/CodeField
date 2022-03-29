package exp4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;

public class BookUseComparator {
	public static void main(String[] args) {
		ArrayList<Book> Books = new ArrayList<Book>();
		Books.add(new Book(11,"程序设计",59.8,new GregorianCalendar(2009,0,1)));
		Books.add(new Book(2,"操作系统",89.68,new GregorianCalendar(2008,7,8)));
		Books.add(new Book(3,"中国历史",35.8,new GregorianCalendar(2008,6,8)));

		System.out.println("按照正常加入的顺序排序如下：");
		for(Book s:Books){
			Book o = s;
			System.out.println(o.toString());
		}

		Collections.sort(Books,(Book b1,Book b2)->{
			return b1.id-b2.id;
		});
		System.out.println("按照书的编号升序排序如下：");
		for(Book s:Books){
			Book o = s;
			System.out.println(o.toString());
		}

		System.out.println("按照书的价格升序排序如下");
		Collections.sort(Books,(Book b1,Book b2)->{
			if(b1.price > b2.price){
				return 1;
			}else{
				return -1;
			}
		});
		for(Book s:Books){
			Book o = s;
			System.out.println(o.toString());
		}

		System.out.println("按照书的出版日期升序排序如下");
		Collections.sort(Books,(Book b1, Book b2) ->{
			if(b1.date.after(b2.date)){
				return 1;
			}else{
				return -1;
			}
		});
		for(Book s:Books){
			Book o = s;
			System.out.println(o.toString());
		}
	}
}
