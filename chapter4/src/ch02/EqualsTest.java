package ch02;

public class EqualsTest {
	public static void main(String[] args) {
		//�츮�� ��ȣ�� ���ٸ� �����ϰ� �ʹ�.
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;//�ּҸ� �Ѱ��ش�.
		
		
		
		System.out.println(std1 == std2);//false
		System.out.println(std1.equals(std2));//false // �ٲٰ� �� �� true
		System.out.println(std1 == std3);//true
		
		System.out.println(std1.hashCode());//1554547125 // �ٲٰ� �� �� 100
		System.out.println(std2.hashCode());//617901222  // 100
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));//true
		
		System.out.println(str1.hashCode());//96354
		System.out.println(str2.hashCode());//96354
		
		Integer i = 100;
		System.out.println(i.hashCode());//100 �״�� ��ȯ���� 
		// �׷��� ������ �ؽ��ڵ带 ������ �Ҷ� ��Ʈ���� ��ȯ��Ű�� ���� �ؽ����� �ȴ�.
		
		
		
	}
}
