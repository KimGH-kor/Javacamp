package ch07;

public abstract class Computer {
	
	public abstract void display();//하위 클래스에서 구현해라(보디가 없는 것을 보고 파악)
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전월을 켭니다.");
		
	}
	
	public void turnOut() {
		System.out.println("전월을 끕니다.");
		
	}
	
}
