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
		System.out.println(subwayNumber+"�� ����ö�� �°��� "+people+"���̰� ������ "+money+"�Դϴ�.");
		
	}
}
