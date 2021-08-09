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
		System.out.println(BusNumber+"번 버스의 승객은 "+people+"명이고 수익은 "+money+"입니다.");
	}
	
	
}
