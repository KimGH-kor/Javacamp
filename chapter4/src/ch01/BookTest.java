package ch01;

class Book{
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {
		return title + ","+ author;
	}
	
}


public class BookTest {
	public static void main(String[] args) {
		
		Book book = new Book("데미안", "헤르만 헤세");
		//자동으로 toString이 import된다.
		System.out.println(book);//원래라면 ch01.Book@1c2c22f3가 나오지만 
		                         //toString을 재정의함으로써 데미안,헤르만 헤세가 출력된다.

		String str = new String("test");
		
		//자동으로 import해준것
		System.out.println(str);//test
		System.out.println(str.toString());//test
		
	}
}
