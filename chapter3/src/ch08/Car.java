package ch08;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	public void washCar() {};
	
	
	//����Ŭ�������� ���� �Ұ��ϰ� �����
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
}