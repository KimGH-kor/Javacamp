package ch11Test;

public class Subway {
	int SubwayNumber;
	int money;
	int people = 0;
	
	public Subway(int SubwayNumber) {
		this.SubwayNumber = SubwayNumber;
	}
	
	public void take(int money) {
		this.money += 1200;
		people++;
	}
	
	public int showNumber () {
		return SubwayNumber;
	}
	
	public void showSubwayInfo() {
		System.out.println(SubwayNumber+"�� �°��� "+people+"�� �̰� ������ "+money+"�Դϴ�.");
	}
}
