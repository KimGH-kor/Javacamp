package ch11Test6;

public class Texi {
	int Number;
	int money;
	int people;
	
	public Texi(int Number) {
		this.Number = Number;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showTexiInfo() {
		System.out.println(Number+"의 택시 승객은 "+people+"이고 수익은 "+money+"입니다.");
	}
}
