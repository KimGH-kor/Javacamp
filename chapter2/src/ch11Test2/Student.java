package ch11Test2;

public class Student {
	String name;
	int money;
	
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1800);//돈 더할거임
		this.money -= 1800;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1250);
		this.money -=1250;
	}
	
	public void takeTexi(Texi texi) {
		texi.take(2800);
		this.money -= 2800;
	}
	
	
	public void showStudentInfo() {
		System.out.println(name + "의 남은 돈은 "+money+"입니다.");
	}
	
}
