package ch16;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input;
		int sum = 0;
		
		input = scanner.nextInt();
		
//		while(input != 0) {
//			sum += input;
//			input = scanner.nextInt();
//		}
//		System.out.println(sum);
		//위에 while문과 같은 식
		do {
			input = scanner.nextInt();
			sum += input;
		}while(input !=0);
		System.out.println(sum);
	}
}
