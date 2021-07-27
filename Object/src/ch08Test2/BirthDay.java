package ch08Test2;

public class BirthDay {
	String name;
	int month;
	int day;
	int year;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}
	
	
	public void showDate() {
		if(day < 32 && month < 13) {
		System.out.println(name+"의 생일은 "+year+"년 "+month+"월 "+day+"일 입니다.");
	}else {
		System.out.println("없는 달입니다.");
	}
			
	}
	
	
}
