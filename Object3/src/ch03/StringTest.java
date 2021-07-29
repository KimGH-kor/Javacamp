package ch03;

public class StringTest {
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		
		System.out.println(System.identityHashCode(java));//1123225098
		//concat 문자열을 더해준다. 
		
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java));//606548741
		
		//즉 java에 넣더라도 메모리가 새로 생성되기 때문에 비효율적이다.
		
	}
}
