package ch19;

public class BreakTest {
	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		for(num = 1; sum < 100; num++) {
			sum += num;
		}
		
		System.out.println(sum);//105
		//답은 14인데 한번더 더해져서 15가 되서 나온다.
		System.out.println(num);//15
		
		
		//14번까지 더한게 100을 넘는다.
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
