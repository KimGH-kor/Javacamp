package ch19;

public class BreakTest {
	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		for(num = 1; sum < 100; num++) {
			sum += num;
		}
		
		System.out.println(sum);//105
		//���� 14�ε� �ѹ��� �������� 15�� �Ǽ� ���´�.
		System.out.println(num);//15
		
		
		//14������ ���Ѱ� 100�� �Ѵ´�.
		sum = 0;
		
		for(num = 1; ; num++) {
			sum += num;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println(sum);//105
		System.out.println(num);//14
	}
}
