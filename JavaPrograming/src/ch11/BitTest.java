package ch11;

public class BitTest {
	public static void main(String[] args) {
		int num1 = 5;  	// 00000101
		int num2 = 10; 	// 00001010
				
		System.out.println(num1 | num2);//15  00001111 ��
		System.out.println(num1 & num2);//0   00000000 ��
		System.out.println(num1 ^ num2);//15 00001111  ���� �ٸ� ���
		System.out.println(~num1);//-6 �� ����
		
		System.out.println(num1 << 2);//20  ���� 2�� (������) ��ŭ ���� -> 5*2�� 2��
		System.out.println(num1);//5
		System.out.println(num1 <<= 2);//20 num1�� ���Ա���
		System.out.println(num1);//20

	}
}
