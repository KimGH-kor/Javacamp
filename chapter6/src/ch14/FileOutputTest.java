package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65);//A
			fos.write(66);//B
			fos.write(67);//C�� �ԷµǼ� ���� ��
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}
