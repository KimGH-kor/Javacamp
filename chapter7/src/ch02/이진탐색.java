package ch02;

public class ����Ž�� {
	public static void main(String[] args) {
		//Ʈ�����·� ���ٿ� ������ �����ض�.
		//�ʼ� ������ ������ �Ǿ��־���Ѵ�.
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
			System.out.println(mid+"�����ֽ��ϴ�.");
		}else {
			System.out.println("ã�� ���ڰ� �����ϴ�.");
		}
		
		
	}
}
