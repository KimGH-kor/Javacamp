package ch03;

public class StringTest {
	public static void main(String[] args) {
		String java = new String("java");
		String android = new String("android");
		
		
		System.out.println(System.identityHashCode(java));//1123225098
		//concat ���ڿ��� �����ش�. 
		
		java = java.concat(android);
		
		System.out.println(System.identityHashCode(java));//606548741
		
		//�� java�� �ִ��� �޸𸮰� ���� �����Ǳ� ������ ��ȿ�����̴�.
		
	}
}
