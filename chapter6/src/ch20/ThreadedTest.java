package ch20;

//방법 1. Thread를 상속
//스레드를 상속받고 쓸려면 run() 메소드를 구현하고 사용은 start
class MyThread extends Thread{
	public void run() {
		int i;
		for(i =1; i <= 10; i++) {
			System.out.print(i+" ");
		}
	}
}


public class ThreadedTest {
	public static void main(String[] args) {
		//Thread.currentThread()는 어디서 호출했는지 우선순위 등등 스레드의 정보 출력
		//우리는 항상 메인스레드를 사용하고 있기때문에 메인부터 실행되고 스레드가 실행됨
		System.out.println(Thread.currentThread()+"start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread()+"end");
	}
}
