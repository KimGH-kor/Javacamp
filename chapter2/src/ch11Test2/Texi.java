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
		System.out.println(texiNumber+"번 택시의 승객은 "+passenjer+"명 이고 수익은 "+money+"입니다.");
	}
	
}
