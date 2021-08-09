package ch11Test;

public class Student {
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200; 
	}
	
	public void takeTexi(Texi texi) {
		texi.take(2800);
		this.money -= 2800;
	}
	
	public void showStudentInto() {
		System.out.println(name + "의 남은 금액은"+ money + "입니다.");
	}
	
	
}
