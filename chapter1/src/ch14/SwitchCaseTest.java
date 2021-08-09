package ch14;

import java.util.Scanner;

public class SwitchCaseTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		//switch를 반환값으로도 바로 받을 수 있다.
		//또한 자바 15부터 , 사용 가능
		//yield = 반환값 1가지만 수행하면 필요 없다.
		int day = switch(month) {
		
		case 1, 3, 5, 7, 8, 10, 12 ->
			31;
			
		case 2 -> 
			28;
			
		case 4, 6, 9, 11 ->
			30;
			
		default -> {
			System.out.println("존재하지 않는 달입니다.");
			yield -1;
		}
	};
	System.out.println(month+"월은 "+day+"일 입니다.");
		//스위치문만 간단하게
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
//				System.out.println("존재하지 않는 달입니다.");
//				day = -1;
//			}
//		}
//		System.out.println(month+"월은 "+day+"일 입니다.");
	}
}
