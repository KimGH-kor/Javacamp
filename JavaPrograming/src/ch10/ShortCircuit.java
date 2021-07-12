package ch10;

public class ShortCircuit {
	public static void main(String[] args) {
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10);
		System.out.println(value);//false
		System.out.println(num1);//20  -> 일단 대입은 되고 비교한다음 false가 나와서 뒤에꺼는 진행 되지 않는다.
		System.out.println(i);//2  진행되지 않아 i값은 여전히 2이다.
		
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);
		System.out.println(value);//true
		System.out.println(num1);//30 위에서 20으로 더해져있기 때문에 거기서 10을 더한 30이 출력
		System.out.println(i);//4 or연산자이기 때문에 잎에껏이 false이 때문에 i가 진행 4가 출력

	}
}
