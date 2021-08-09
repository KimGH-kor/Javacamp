package ch14;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest {
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output.txt")){
			fos.write(65);//A
			fos.write(66);//B
			fos.write(67);//C가 입력되서 들어가게 됨
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("end");
	}
}
