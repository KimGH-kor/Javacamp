package ch11Test2;

public class Texi {

	int texiNumber;
	int money;
	int passenjer;
	
	public Texi(int texiNumber) {
		this.texiNumber = texiNumber;
	}
	
	public void take(int money) {
		money +=1250;
		passenjer++;
	}
	
	public void showInfo() {
		System.out.println(texiNumber+"�� �ý��� �°��� "+passenjer+"�� �̰� ������ "+money+"�Դϴ�.");
	}
	
}
