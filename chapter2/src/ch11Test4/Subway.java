package ch11Test4;

public class Subway {
	int subwayNumber;
	int money;
	int people;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber+"번 지하철의 승객은 "+people+"명이고 수익은 "+money+"입니다.");
		
	}
}
