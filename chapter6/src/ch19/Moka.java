package ch19;

public class Moka extends Decorator{

	public Moka(Coffee coffee) {
		super(coffee);
		// TODO Auto-generated constructor stub
	}
	public void brewing() {
		super.brewing();
		System.out.print(" Adding Moka");
	}
}
