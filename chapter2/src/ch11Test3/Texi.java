package ch11Test3;

public class Texi {
	int texiNumber;
	int money;
	
	public Texi(int texiNumber) {
		this.texiNumber = texiNumber;
	}
	
	public void take(int money) {
		this.money += money;
	}
	
	public void showBusInfo() {
		System.out.println(texiNumber+"�� ������ ������ "+money+"�Դϴ�.");
	}
}
