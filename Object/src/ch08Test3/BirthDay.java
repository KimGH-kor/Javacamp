package ch08Test3;

public class BirthDay {
	String name;
	int Day;
	int Month;
	int Year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDay() {
		return Day;
	}
	public void setDay(int day) {
		Day = day;
	}
	public int getMonth() {
		return Month;
	}
	public void setMonth(int month) {
		Month = month;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public void showDate() {
		System.out.println(name+"의 생일은 "+Year+"년 "+Month+"월 "+Day+"일 입니다.");
	}
	
}
