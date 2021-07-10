package ch08;

public class ConstantTest {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;//상수는 대문자로 표현한다,
		final int MIN_NUM; //선언만 한 것
		
		MIN_NUM = 0;// 초기화 해 주지 않는다면 쓸 수 없기에 초기화 시켜준다.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000; 오류! final(상수)값은 바꿀 수 없다.

	}

}
