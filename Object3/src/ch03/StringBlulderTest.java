package ch03;

public class StringBlulderTest {
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		
		System.out.println(System.identityHashCode(buffer));//1123225098
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));//1123225098
		//합쳐도 같은 주소값을 가짐 -> 즉 메모리 낭비를 최소화 시킬 수 있다.
		
		String test = buffer.toString();
		System.out.println(test);
		
		
	}
}
