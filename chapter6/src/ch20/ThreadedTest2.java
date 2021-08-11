package ch20;

//방법 2. Runnable 인터페이스를 상속
class MyThread2 implements Runnable{

	@Override
	public void run() {
		int i;
		for(i =1; i <= 100; i++) {
			System.out.print(i+" ");
		}
	}
}

public class ThreadedTest2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread()+"start");
		//쓰레드의 Runnable 인스턴스를 생성후
		MyThread2 runnable = new MyThread2();
		
		//Thread클래스의 runnable를 넣어준다.
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread()+"end");
		
		//익명 클래스로 바로 구현 하는 방법도 있다.
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		
		run.run();
	}
}
