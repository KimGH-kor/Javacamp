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
		System.out.println(SubwayNumber+"�� ����ö�� �°��� "+people+"���̰� ������ "+money+"�Դϴ�.");
	}

	public int showNumber() {
		return SubwayNumber;
	}
	
	
}
