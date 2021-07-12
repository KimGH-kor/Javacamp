package ch11;

public class BitTest {
	public static void main(String[] args) {
		int num1 = 5;  	// 00000101
		int num2 = 10; 	// 00001010
				
		System.out.println(num1 | num2);//15  00001111 곱
		System.out.println(num1 & num2);//0   00000000 합
		System.out.println(num1 ^ num2);//15 00001111  서로 다른 경우
		System.out.println(~num1);//-6 값 반전
		
		System.out.println(num1 << 2);//20  값의 2의 (넣은값) 만큼 증가 -> 5*2의 2승
		System.out.println(num1);//5
		System.out.println(num1 <<= 2);//20 num1에 대입까지
		System.out.println(num1);//20

	}
}
