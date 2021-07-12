package ch11;

import java.util.Scanner;

public class ConitionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//System.out는 출력 System.in는 입력
				
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
		
		System.out.println("입력 1 : ");
		int num1 = scanner.nextInt();
		System.out.println("입력 2 : ");
		int num2 = scanner.nextInt();
		
		//삼항 연산자
		max = (num1 > num2)? num1 : num2;//크다면 true라서 앞의 값 작다면 false라서 뒤의 값
		System.out.println("더 큰 수는 "+max);
	}
}
