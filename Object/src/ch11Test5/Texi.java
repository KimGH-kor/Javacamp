package ch11Test5;

public class Texi {
	int TexiNumber;
	int money;
	int people;
	
	
	public Texi(int TexiNumber) {
		this.TexiNumber = TexiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showTexiInfo() {
		System.out.println(TexiNumber+"�� �ý��� �°��� "+people+"���̰� ������ "+money+"�Դϴ�.");
	}
	
	
}
