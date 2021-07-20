package ch14Test2;

public class CarFactory {
	
	private static CarFactory instance = new CarFactory();

	public static CarFactory getInstance() {
		return instance;
	}
	
	//이게 뭐야
	public Car createCar() {
		Car car = new Car();
		return car;//참조 변수 반환
		//여기서 참조변수를 만들어준다?
	}
	

}
