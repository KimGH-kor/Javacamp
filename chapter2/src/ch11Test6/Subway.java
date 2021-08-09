package ch11Test6;

public class Subway {
	int Number;
	int money;
	int people;
	
	public Subway(int Number) {
		this.Number = Number;
	}
	
	public void take(int money) {
		this.money += money;
		people++;
	}
	
	public void showSubwayInfo() {
		System.out.println(Number+"의 지하철 승객은 "+people+"이고 수익은 "+money+"입니다.");
	}
}
