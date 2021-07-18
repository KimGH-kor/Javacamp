package ch14Test;

public class CarFactory {
private static CarFactory instance = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	//이게 뭐야
	public Car createCar() {
		
		Car car = new Car();
		return car;//참조 변수 반환
		//여기서 참조변수를 만들어준다?
	}
}
