package ch11Test2;

public class Subway {
	int subwayNumber;
	int money;
	int passenjer;
	
	public Subway(int subwayNumber) {
		this.subwayNumber = subwayNumber;
	}
	
	public void take(int money) {
		money +=1250;
		passenjer++;
	}
	
	public void showInfo() {
		System.out.println(subwayNumber+"�� ����ö�� �°��� "+passenjer+"�� �̰� ������ "+money+"�Դϴ�.");
	}
	
}
