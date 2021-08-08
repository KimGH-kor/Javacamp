package ch09;

public class ArrayIndexException {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		try {
			for(int i =0; i <= 5; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}
		
		System.out.println("here!!!");//오류가 발생해도 처리 된다.
 	}
}
