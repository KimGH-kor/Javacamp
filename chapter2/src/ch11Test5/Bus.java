package ch11Test5;

public class Bus {
	int BusNumber;
	int money;
	int people;
	
	
	public Bus(int BusNumber) {
		this.BusNumber = BusNumber;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showBusInfo() {
		System.out.println(BusNumber+"�� ������ �°��� "+people+"���̰� ������ "+money+"�Դϴ�.");
	}
	
	
}
