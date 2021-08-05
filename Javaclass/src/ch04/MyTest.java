package ch04;

public class MyTest {
	public static void main(String[] args) {
		
		MyNumber mynumber = (x, y) -> x > y? x:y;
		
		System.out.println(mynumber.getMax(10, 20));
			
		
	}
}
