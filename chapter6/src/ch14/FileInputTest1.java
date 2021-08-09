package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {
	public static void main(String[] args) {
		
		int i;
		try(FileInputStream fis = new FileInputStream("input.txt")){
			//read()�� ������ ���� -1�� ����ϱ� ������ -1�� �ƴҶ� ���� ����϶� �ϸ�
			//�ȿ� �ִ� ������ �� ����ϰ� �ȴ�.
			while((i=fis.read())!= -1) {
				System.out.println((char) i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
	}
}
