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
		
		str = "hello";//��Ʈ���� ��Ʈ������ ������ ����
//		str = 3; �ڹٿ��� �̰� �Ұ��� ������Ÿ���� �ٲ� ���� ����.
	}
}
