package ch11Test;

public class Bus {
	int busNumber;
	int money;
	int pay;
	int people = 0;
	
	public Bus(int pay) {
		this.pay = pay;
	}
	
	public void take(int money) {
		this.money += pay;
		people++;
	}

	public void showBusInfo() {
		System.out.println(busNumber+"�� �°��� "+people+"�� �̰� ������ "+money+"�Դϴ�.");
	}
	
}
