package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceoptionHandling {
	public static void main(String[] args) {
		
		//자동으로 close시켜줌 ->AutoCloseable를 import하고 있기때문에
		try(FileInputStream fis = new FileInputStream("a.txt")) {
			System.out.println("read");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}

