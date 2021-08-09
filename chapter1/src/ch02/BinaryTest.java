package ch02;

public class BinaryTest {

	public static void main(String[] args) {
		int num = 10;
		int bNum = 0B1010;//0B = 2진수를 뒤에 쓰겠다.
		int oNum = 012;//앞에 0을 넣으면 8진수
		int xNum = 0XA;//16진수
		
		System.out.println(num);//10
		System.out.println(bNum);//10
		System.out.println(oNum);//10
		System.out.println(xNum);//10
	}

}
