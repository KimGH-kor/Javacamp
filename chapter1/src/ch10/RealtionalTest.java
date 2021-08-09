package ch10;

public class RealtionalTest {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		//관계 연산자는 값을 boolean타입으로 반환한다.
		boolean value = (num1 > num2);
		System.out.println(value);//true
		
		System.out.println(num1 < num2);//false
		System.out.println(num1 >= num2);//true
		System.out.println(num1 <= num2);//false
		System.out.println(num1 == num2);//false
		System.out.println(num1 != num2);//true

	}
}
