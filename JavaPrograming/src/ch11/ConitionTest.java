package ch11;

import java.util.Scanner;

public class ConitionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//System.out�� ��� System.in�� �Է�
				
		int max;
		System.out.println("�� ���� �Է� �޾Ƽ� �� ū ���� ����ϼ���\n");
		
		System.out.println("�Է� 1 : ");
		int num1 = scanner.nextInt();
		System.out.println("�Է� 2 : ");
		int num2 = scanner.nextInt();
		
		//���� ������
		max = (num1 > num2)? num1 : num2;//ũ�ٸ� true�� ���� �� �۴ٸ� false�� ���� ��
		System.out.println("�� ū ���� "+max);
	}
}
