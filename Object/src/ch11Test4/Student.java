package ch11Test4;

public class Student {
	int money;
	String name;
	
	public Student(String name, int money ) {
		this.money = money;
		this.name = name;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1600);
		money -= 1600;
	}
	public void takeSubway(Subway subway) {
		subway.take(1200);
		money -= 1200;
	}
	public void takeTexi(Texi texi) {
		texi.take(2800);
		money -= 2800;
	}
	
	public void showInfo() {
		System.out.println(name+"님의 남은 금액은 "+money+"입니다." );
	}
}
