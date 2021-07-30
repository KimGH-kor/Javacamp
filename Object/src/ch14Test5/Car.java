package ch14Test5;

public class Car {
	int CarNum;
	static int sir = 10000;
	
	public Car() {
		sir++;
		CarNum = sir;
	}
	
	public int getCarNum() {
		return CarNum;
	}
	
	
}
