package ch20;

//��� 2. Runnable �������̽��� ���
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
		//�������� Runnable �ν��Ͻ��� ������
		MyThread2 runnable = new MyThread2();
		
		//ThreadŬ������ runnable�� �־��ش�.
		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread()+"end");
		
		//�͸� Ŭ������ �ٷ� ���� �ϴ� ����� �ִ�.
		Runnable run = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run");
			}
		};
		
		run.run();
	}
}
