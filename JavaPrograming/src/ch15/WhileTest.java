package ch15;

public class WhileTest {
	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println(sum);//55
	}
//	while(true) { 이건 무한 반복
//		
//	}
}
