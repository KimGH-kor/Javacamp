package ch08;

public class BirthDayTest {
	public static void main(String[] args) {
		BirthDay date = new BirthDay();
		date.setYear(2019);
		date.setMonth(12);
		date.setDay(30);
		
//		date.month = 100;//private로 지정하지 않으면 이렇게도 접근이 가능하다.
		
		date.showDate();
	}
}
