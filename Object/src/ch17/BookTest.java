package ch17;

import java.util.ArrayList;

import ch16.Book;

public class BookTest {
	public static void main(String[] args) {
	
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("�¹���","����"));
		library.add(new Book("�¹���2","����"));
		library.add(new Book("�¹���3","����"));
		library.add(new Book("�¹���4","����"));
		library.add(new Book("�¹���5","����"));
	
		library.get(1).showBook();
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showBook();
		}
		
	}
}
