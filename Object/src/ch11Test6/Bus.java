package ch11Test6;

public class Bus {
	int Number;
	int money;
	int people;
	
	public Bus(int Number) {
		this.Number = Number;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showBusInfo() {
		System.out.println(Number+"�� ���� �°��� "+people+"�̰� ������ "+money+"�Դϴ�.");
	}
	
}
