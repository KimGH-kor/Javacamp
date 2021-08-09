package ch11;

public class Subway {
	int subwayNumber;
	int money;
	int passengerCount;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNumber+"번 지하철의 승객 수는 "+passengerCount+"이고, 수입은 "+money+"입니다.");
	}
}
