package ch11Test;

public class Texi {
	int TexiNumber;
	int money;
	int people = 0;
	
	public Texi(int TexiNumber) {
		this.TexiNumber = TexiNumber;
	}
	
	public void take(int money) {
		this.money += 2800;
		people++;
	}
	
	public void showSubwayInfo() {
		System.out.println(TexiNumber+"�� �°��� "+people+"�� �̰� ������ "+money+"�Դϴ�.");
	}
}
