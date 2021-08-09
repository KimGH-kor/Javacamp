package ch14Test5;

public class CarFactory {
	private static CarFactory insteance = new CarFactory();
	
	public static CarFactory getInstance() {
		return insteance;
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
}
