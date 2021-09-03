package ch01;

public class 최대값최솟값 {
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
		
		System.out.println("max값은 "+max+" 위치는 "+posmax+"번째입니다.");
		System.out.println("min값은 "+min+" 위치는 "+posmin+"번째입니다.");
		
	}
}
