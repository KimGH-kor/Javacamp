package ch11Test6;

public class Texi {
	int Number;
	int money;
	int people;
	
	public Texi(int Number) {
		this.Number = Number;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showTexiInfo() {
		System.out.println(Number+"�� �ý� �°��� "+people+"�̰� ������ "+money+"�Դϴ�.");
	}
}
