package ch11Test6;

public class Subway {
	int Number;
	int money;
	int people;
	
	public Subway(int Number) {
		this.Number = Number;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showSubwayInfo() {
		System.out.println(Number+"�� ����ö �°��� "+people+"�̰� ������ "+money+"�Դϴ�.");
	}
}
