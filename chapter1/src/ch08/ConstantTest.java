package ch08;

public class ConstantTest {

	public static void main(String[] args) {
		
		final int MAX_NUM = 100;//����� �빮�ڷ� ǥ���Ѵ�,
		final int MIN_NUM; //���� �� ��
		
		MIN_NUM = 0;// �ʱ�ȭ �� ���� �ʴ´ٸ� �� �� ���⿡ �ʱ�ȭ �����ش�.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM = 1000; ����! final(���)���� �ٲ� �� ����.

	}

}
