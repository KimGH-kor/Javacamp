package ch02;

public class FunctionTest {
	//���ϱ� �Լ�(�Ű������� �ִ�) return���� �־��־���Ѵ�.
	public static int addNum(int num1, int num2) {
		int result;
		result = num1 + num2 ;
		return result;
	}
	
	//����Ʈ �Լ� void = return���� ��� �ȴ�.
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	//0~100���� ���ϴ� �Լ� (�Ű������� ����)
	public static int calcSum() {
		int sum = 0;
		
		for(int i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		//���¹�
		int total = addNum(n1, n2);
		System.out.println(total);//30;
		
		sayHello("�ȳ��ϼ���");//�ȳ��ϼ���
		
		total = calcSum();
		System.out.println(total);//4950
		
	}
	
}
