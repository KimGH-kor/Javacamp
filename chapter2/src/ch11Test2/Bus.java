package ch11Test2;

public class Bus {
	int busNumber;
	int money;
	int passerger;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passerger++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"�� ������ �°��� "+passerger+"�� �̰� ������ "+money+"�Դϴ�.");
	}
	
}
