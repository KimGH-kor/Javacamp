package ch16;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
	public static void main(String[] args) {
		//1바이트 단위로 읽기 때문에 inputStreamReader을 보조스트림으로 써주어야한다.
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
