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
		System.out.println(texiNumber+"번 택시의 승객은 "+people+"명이고 수익은 "+money+"입니다.");
		
	}
}
