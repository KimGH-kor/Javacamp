package ch17;

public class ForTest {
	public static void main(String[] args) {
		
		int count = 1;
		int sum = 0;
		
		//for�� ���� ���
		for(int i = 0; i < 10; count++, i++) {
			
			sum += count;
		}
		System.out.println(sum);//55
		
		//while�� ���� ���
		int num = 1;
		int total = 0;
		
		while( num <= 10) {
			total += num;
			num++;
		}
		System.out.println(total);//55

	}
}
