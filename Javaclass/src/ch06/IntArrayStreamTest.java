package ch06;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		//forEach���� ���� ���� �ؾ���
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		//�ѹ� ���� �Ҹ�Ǽ� �ٽ� �� �� ����
		
		int sum = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();
		System.out.println(sum);
		System.out.println(count);

		
	}
}
