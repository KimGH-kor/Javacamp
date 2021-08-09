package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		//1����Ʈ ������ �б� ������ inputStreamReader�� ������Ʈ������ ���־���Ѵ�.
		try(InputStreamReader isr = new InputStreamReader(new FileInputStream("read.txt"))){
			
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
