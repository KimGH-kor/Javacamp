package ch06;

public class CharaterTest {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		System.out.println(ch1);//A
		System.out.println((int)ch1);//65 ���� ����ȯ A�� �ƽ�Ű�ڵ� ��
		
		char ch2 = 66;
		System.out.println(ch2);//B
		System.out.println((char)ch2);//B
		
		int ch3 = 67;
		System.out.println(ch3);//67
		System.out.println((char)ch3);//C
		
//		char ch4 = -66; ���̳ʽ� ���� ���ü� ��� ������ ����.
		
//		char ch = 1234567; �ʹ� ū ���ڵ� �Ұ�
		char ch = '\uD55C';//�����ڵ� ����� ��(16����)
		System.out.println(ch);//��
		
	}

}
