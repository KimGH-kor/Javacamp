package ch11Test3;

public class Bus {
	int busNumber;
	int money;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showBusInfo() {
		System.out.println(busNumber+"번 버스의 수익은 "+money+"입니다.");
	}
	
}
