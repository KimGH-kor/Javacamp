package ch08Test2;

public class BirthDayTest {
	public static void main(String[] args) {
		BirthDay Lee = new BirthDay();
		
		Lee.setName("Lee");
		Lee.setDay(25);
		Lee.setMonth(11);
		Lee.setYear(2000);
		
		String name = Lee.getName();
		int day = Lee.getDay();
		int month = Lee.getMonth();
		int year = Lee.getYear();
		
		System.out.println(name+day+month+year);
		Lee.showDate();
	}
}
