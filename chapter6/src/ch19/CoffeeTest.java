package ch19;

public class CoffeeTest {
	public static void main(String[] args) {
		
		Coffee etiopiaCoffee = new EtiopiaAmericano();
		
		etiopiaCoffee.brewing();
		
		System.out.println("");
		Coffee etiopiaLatte = new Latte(etiopiaCoffee);
		etiopiaLatte.brewing();
		
		System.out.println("");
		Coffee etiopiaMoka = new Moka(etiopiaLatte);
		etiopiaMoka.brewing();
		
		System.out.println("");
		Coffee coffee = new Latte(new Moka(new EtiopiaAmericano()));
		coffee.brewing();
		
	}
}
