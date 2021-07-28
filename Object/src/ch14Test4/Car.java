package ch14Test4;

public class Car {
	private int carNum;
	private static int sir = 10000;
	
	public Car() {
		sir++;
		carNum = sir;
	}
	
	public int getCarNum() {
		return carNum;
	}
	
}
