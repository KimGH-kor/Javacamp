package ch14Test3;

public class Car {
	private int carNumber;
	private static int sirNum = 10000;
	
	public Car() {
		sirNum++;
		this.carNumber = sirNum;
	}
	
	public int getCarNum() {
		return carNumber;
	}
	
}
