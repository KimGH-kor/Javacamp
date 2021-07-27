package ch11Test5;

public class Subway {
	int SubwayNumber;
	int money;
	int people;
	
	
	public Subway(int SubwayNumber) {
		this.SubwayNumber = SubwayNumber;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showSubwayInfo() {
		System.out.println(SubwayNumber+"번 지하철의 승객은 "+people+"명이고 수익은 "+money+"입니다.");
	}

	public int showNumber() {
		return SubwayNumber;
	}
	
	
}
