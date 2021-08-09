package ch15;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int total = 0;
		
		for(int i =0, num = 1; i < arr.length; i++) {
			arr[i] = num++;
		}
		
		//배열 안에 있는거 꺼내 쓰기
		for(int num : arr) {
			total += num;
		}
		
		
		System.out.println(total);//55
	}
}
