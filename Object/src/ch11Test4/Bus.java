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
		System.out.println(busNumber+"번 버스의 승객은 "+people+"명이고 수익은 "+money+"입니다.");
		
	}
	
}
