package ch04;

public class VariableTest {

	public static void main(String[] args) {
		byte bnum = 127;//127까지 표현 가능
//		int num = 12345678900;이건 너무 커서 오류
		long lNum = 12345678900L;//long타입은 L을 붙여 주어야한다.
		long lNum2 = 123456789;//이건 전혀 문제가 없다.
		
	// long = 값 이 있을때 값은 처음에 int형으로 잡히기 때문에 4바이트 밑의 값은 그냥 저장이 된다.
	//하지만 값이 int값을 넘은 값을 저장할 때는 값자체도 long값으로(8바이트)로 바꾸어 주어야한다.
	}

}
