package ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest1 {
	public static void main(String[] args) {
		
		int i;
		try(FileInputStream fis = new FileInputStream("input.txt")){
			//read()는 파일의 끝을 -1로 출력하기 때문에 -1이 아닐때 까지 출력하라 하면
			//안에 있는 내용을 다 출력하게 된다.
			while((i=fis.read())!= -1) {
				System.out.println((char) i);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
	}
}
