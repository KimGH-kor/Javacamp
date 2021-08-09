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
		
		Book book = new Book("���̾�", "�츣�� �켼");
		//�ڵ����� toString�� import�ȴ�.
		System.out.println(book);//������� ch01.Book@1c2c22f3�� �������� 
		                         //toString�� �����������ν� ���̾�,�츣�� �켼�� ��µȴ�.

		String str = new String("test");
		
		//�ڵ����� import���ذ�
		System.out.println(str);//test
		System.out.println(str.toString());//test
		
	}
}
