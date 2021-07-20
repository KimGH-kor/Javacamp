package ch14Test2;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		CarFactory factory2 = CarFactory.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		Car moning = factory2.createCar();
		
		
		System.out.println(factory);
		System.out.println(factory2);
		
		System.out.println(mySonata.getCarNum());     //10001 출력
		System.out.println(yourSonata.getCarNum());   //10002 출력
		System.out.println(moning.getCarNum());
	}
}

