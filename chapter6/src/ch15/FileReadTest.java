package ch15;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest {
	public static void main(String[] args) {
		
		
		try(FileReader fir = new FileReader("read.txt")){
			int i;
			
			while((i = fir.read()) != -1) {
				System.out.print((char)i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
