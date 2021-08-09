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
		
		//forEach문은 내가 구현 해야함
		System.out.println();
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		//한번 쓰면 소모되서 다시 쓸 수 없음
		
		int sum = Arrays.stream(arr).sum();
		long count = Arrays.stream(arr).count();
		System.out.println(sum);
		System.out.println(count);

		
	}
}
