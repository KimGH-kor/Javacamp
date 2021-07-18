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
		System.out.println(subwayNumber+"번 지하철의 승객은 "+passenjer+"명 이고 수익은 "+money+"입니다.");
	}
	
}
