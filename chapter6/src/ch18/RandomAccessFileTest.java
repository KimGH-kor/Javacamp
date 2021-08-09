package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("pos: "+ rf.getFilePointer());
		rf.writeDouble(3.14);
		System.out.println("pos: "+ rf.getFilePointer());
		rf.writeUTF("안녕하세요");
		System.out.println("pos: "+ rf.getFilePointer());
		
		rf.seek(0);
		System.out.println("pos: "+ rf.getFilePointer());
		//바로 출력하기 위해서는 포인터를 옮겨주어햐한다.
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		
		
	}

}
