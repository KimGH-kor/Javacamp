package ch03;

public class StringBlulderTest {
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		StringBuilder buffer = new StringBuilder(java);
		
		System.out.println(System.identityHashCode(buffer));//1123225098
		buffer.append(android);
		System.out.println(System.identityHashCode(buffer));//1123225098
		//���ĵ� ���� �ּҰ��� ���� -> �� �޸� ���� �ּ�ȭ ��ų �� �ִ�.
		
		String test = buffer.toString();
		System.out.println(test);
		
		
	}
}
