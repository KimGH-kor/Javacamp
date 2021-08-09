package ch14Test2;

public class Car {
	private int Carnum;
	private static int sir = 10000;
	
	public Car() {
		sir++;
		Carnum = sir;
	}

	public int getCarNum() {
		return Carnum;
	}

		
}
