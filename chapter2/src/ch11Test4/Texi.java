package ch11Test4;

public class Texi {
	int texiNumber;
	int money;
	int people;
	
	public Texi(int texiNumber) {
		this.texiNumber = texiNumber;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showTexiInfo() {
		System.out.println(texiNumber+"�� �ý��� �°��� "+people+"���̰� ������ "+money+"�Դϴ�.");
		
	}
}
