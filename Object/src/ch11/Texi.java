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
		System.out.println(texiNumber+"�� �ý��� �°� ���� "+passengerCount+"�̰�, ������ "+money+"�Դϴ�.");
	}
	
}
