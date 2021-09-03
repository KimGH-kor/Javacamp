package ch02;

public class 이진탐색 {
	public static void main(String[] args) {
		//트리형태로 업다운 게임을 생각해라.
		//필수 조건은 정렬이 되어있어야한다.
		int[] arr = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
		
		int target = 83;
		int target2 = 88;
		
		int left = 0;
		int right = arr.length-1;
		int mid = (right + left)/2;
		
		int temp = arr[mid];
		boolean find = false;
		
		while(left <= right) {
			if(target == temp) {
				find = true;
				break;
			}else if(target < temp) {
				right = mid -1;
			}else {
				left = mid +1;
			}
			mid = (left+right)/2;
			temp = arr[mid];
		}
		
		if(find == true) {
			mid++;
			System.out.println(mid+"번쨰있습니다.");
		}else {
			System.out.println("찾는 숫자가 없습니다.");
		}
		
		
	}
}
