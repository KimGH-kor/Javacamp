package ch11Test5;

public class Student {
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeSubway(Subway subway) {
		money -= 1250;
		subway.take(1250);
	}
	public void takeBus(Bus bus) {
		money -= 1800;
		bus.take(1800);
	}
	public void takeTexi(Texi texi) {
		money -= 3400;
		texi.take(3400);
	}
	public void showStudentInto() {
		System.out.println(name+"의 남은 금액은 "+money+"입니다.");
	}
	
	
}
