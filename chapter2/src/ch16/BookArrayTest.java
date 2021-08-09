package ch16;

public class BookArrayTest {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("금강산1", "kim");
		library[1] = new Book("금강산2", "kim");
		library[2] = new Book("금강산3", "kim");
		library[3] = new Book("금강산4", "kim");
		library[4] = new Book("금강산5", "kim");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		
		System.out.println("======copy library=========");
		for(Book book : copyLibrary) {
			book.showBook();
		}
		
		System.out.println("======library=========");
		for(Book book : library) {
			book.showBook();
		}
		
	}
}
