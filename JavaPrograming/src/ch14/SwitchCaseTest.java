package ch14;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		//switch�� ��ȯ�����ε� �ٷ� ���� �� �ִ�.
		//���� �ڹ� 15���� , ��� ����
		//yield = ��ȯ�� 1������ �����ϸ� �ʿ� ����.
		int day = switch(month) {
		
		case 1, 3, 5, 7, 8, 10, 12 ->
			31;
			
		case 2 -> 
			28;
			
		case 4, 6, 9, 11 ->
			30;
			
		default -> {
			System.out.println("�������� �ʴ� ���Դϴ�.");
			yield -1;
		}
	};
	System.out.println(month+"���� "+day+"�� �Դϴ�.");
		//����ġ���� �����ϰ�
//		switch(month) {
//			
//			case 1, 3, 5, 7, 8, 10, 12 ->
//				day = 31;
//				
//			case 2 -> 
//				day = 28;
//				
//			case 4, 6, 9, 11 ->
//				day = 30;
//				
//			default -> {
//				System.out.println("�������� �ʴ� ���Դϴ�.");
//				day = -1;
//			}
//		}
//		System.out.println(month+"���� "+day+"�� �Դϴ�.");
	}
}
