package ch01;

public class �ִ밪�ּڰ� {
	public static void main(String[] args) {
		int[] arr = {10,55,23,2,79,101,16,82,30,45};
		
		int max = arr[0];
		int min= arr[0];
		int posmax = 0;
		int posmin = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				posmax = i+1;
			}
			if(min > arr[i]) {
				min = arr[i];
				posmin = i+1;
			}
		}
		
		System.out.println("max���� "+max+" ��ġ�� "+posmax+"��°�Դϴ�.");
		System.out.println("min���� "+min+" ��ġ�� "+posmin+"��°�Դϴ�.");
		
	}
}
