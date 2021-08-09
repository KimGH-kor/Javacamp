package ch07;

public class LocalVariableInter {
	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "test";
		
		System.out.println(i);//10
		System.out.println(j);//10.0
		System.out.println(str);//test
		
		var str2 = str;
		System.out.println(str2);//test
		
		str = "hello";//스트링을 스트링으로 변경은 가능
//		str = 3; 자바에서 이건 불가능 데이터타입이 바뀔 수는 없다.
	}
}
