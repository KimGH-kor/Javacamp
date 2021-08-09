package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {
	public static void main(String[] args) throws IOException {
		
		long millisecond = 0;
		//마지막에 있는것이 기반이 되는 것이 들어가야한다.
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("복사할파일.txt"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.txt"))){
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i = bis.read())!= -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println(millisecond+" 소요되었습니다.");
		
		Socket socket = new Socket();
		
		BufferedReader br = new BufferedReader( new InputStreamReader(socket.getInputStream()));
		
		br.readLine();//한줄 읽음
	}
}
