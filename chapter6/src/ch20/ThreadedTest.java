package ch20;

//��� 1. Thread�� ���
//�����带 ��ӹް� ������ run() �޼ҵ带 �����ϰ� ����� start
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
		//Thread.currentThread()�� ��� ȣ���ߴ��� �켱���� ��� �������� ���� ���
		//�츮�� �׻� ���ν����带 ����ϰ� �ֱ⶧���� ���κ��� ����ǰ� �����尡 �����
		System.out.println(Thread.currentThread()+"start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start();
		th2.start();
		System.out.println(Thread.currentThread()+"end");
	}
}
