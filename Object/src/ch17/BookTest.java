package ch17;

import java.util.ArrayList;

import ch16.Book;

public class BookTest {
	public static void main(String[] args) {
	
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("태백산맥","장길산"));
		library.add(new Book("태백산맥2","장길산"));
		library.add(new Book("태백산맥3","장길산"));
		library.add(new Book("태백산맥4","장길산"));
		library.add(new Book("태백산맥5","장길산"));
	
		library.get(1).showBook();
		
		for(int i = 0; i < library.size(); i++) {
			library.get(i).showBook();
		}
		
	}
}
