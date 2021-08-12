package ch21;

public class JoinTest extends Thread{
	
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		
		int i;
		for( i = start; i <= end; i++) {
			total += i;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			//join = 이거 끝날때 까지 기다려라
			jt1.join();
			jt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//lastTotal은 메인스레드이므로 가장 빨리 처리됨 ->0을 출력
		int lastTotal = jt1.total+jt2.total;
		
		System.out.println("jt1.total "+ jt1.total);
		System.out.println("jt2.total "+jt2.total);
		
		System.out.println("lastTotal "+lastTotal);
		
	}
}
