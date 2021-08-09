package ch11;

public class Texi {
	int texiNumber;
	int money;
	int passengerCount;
	
	public Texi(int texiNumber) {
		this.texiNumber = texiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showTexiInfo() {
		System.out.println(texiNumber+"번 택시의 승객 수는 "+passengerCount+"이고, 수입은 "+money+"입니다.");
	}
	
}
