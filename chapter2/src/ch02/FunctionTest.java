package ch02;

public class FunctionTest {
	//더하기 함수(매개변수가 있다) return값을 넣어주어야한다.
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2 ;
		return result;
	}
	
	//프린트 함수 void = return값이 없어도 된다.
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	//0~100까지 더하는 함수 (매개변수는 없다)
	public static int calcSum() {
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		//쓰는법
		int total = addNum(n1, n2);
		System.out.println(total);//30;
		
		sayHello("안녕하세요");//안녕하세요
		
		total = calcSum();
		System.out.println(total);//4950
		
	}
	
}
