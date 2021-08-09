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
		System.out.println(TexiNumber+"번 택시의 승객은 "+people+"명이고 수익은 "+money+"입니다.");
	}
	
	
}
