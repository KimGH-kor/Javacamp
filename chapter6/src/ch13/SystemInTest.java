package ch13;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) {
		System.out.println("���ĺ� ���� ���� ���� ���͸� ��������");
		
		int i;
		try {//�ѹ���Ʈ�� �б� ������ �ѱ��� ���� ���Ѵ�.
			while((i = System.in.read()) != '\n') {
//			System.out.println(i);
			System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
