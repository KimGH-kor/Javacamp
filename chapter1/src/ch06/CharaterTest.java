package ch06;

public class CharaterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);//A
		System.out.println((int)ch1);//65 강제 형변환 A의 아스키코드 값
		
		char ch2 = 66;
		System.out.println(ch2);//B
		System.out.println((char)ch2);//B
		
		int ch3 = 67;
		System.out.println(ch3);//67
		System.out.println((char)ch3);//C
		
//		char ch4 = -66; 마이너스 값은 들어올수 없어서 오류가 난다.
		
//		char ch = 1234567; 너무 큰 숫자도 불가
		char ch = '\uD55C';//유니코드 사용할 때(16진수)
		System.out.println(ch);//한
		
	}

}
