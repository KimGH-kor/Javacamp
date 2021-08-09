package ch08Test;

public class BirthDay {
	String name; 
	private int day;
	private int month;
	private int year;
	
	private boolean isValue;
	String getName() {
		return name;
	}
	int getDay() {
		return day;
	}
	int getMonth() {
		return month;
	}
	int getYear() {
		return year;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setDay(int day) {
		if(day <= 31 ) {
			isValue = true;
			this.day = day;
		}
	}
	void setMonth(int month) {
		if(month <= 12 ) {
			isValue = true;
			this.month = month;
		}
	}
	void setYear(int year) {
		this.year = year;
	}
	
	void showDate() {
		if(isValue == true) {
		System.out.println(name+"�� ������"+year+"�� "+month+"�� "+day+"�� �Դϴ�.");
		}else {
			System.out.println("�������� �ʴ� ���Դϴ�.");
		}
	}
	
}
