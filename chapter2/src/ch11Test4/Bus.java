package ch11Test4;

public class Bus {
	
	int busNumber;
	int money;
	int people;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"�� ������ �°��� "+people+"���̰� ������ "+money+"�Դϴ�.");
		
	}
	
}
