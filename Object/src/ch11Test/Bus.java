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
		System.out.println(busNumber+"의 승객은 "+people+"명 이고 수입은 "+money+"입니다.");
	}
	
}
