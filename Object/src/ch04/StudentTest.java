package ch04;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(); //studentŬ������ ����Ʈ �����ڰ� ���� ��� �̷��� ������.
											//������ studentŬ������ ����Ʈ �����ڸ� ���� ���־�� �Ѵ�.
		//������ ���� �ʴ� �ٸ�
//		int i;���⼭ i�� ����ҷ��Ѵٸ� �ʱ�ȭ�� �ȵǾ��ֱ� ������ ��������.
		System.out.println(studentLee.showStudentInfo());//null�л��� �й��� 0�̰�, 0�г� �Դϴ�.
		
		Student studentKim = new Student(12345, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());//Kim�л��� �й��� 12345�̰�, 3�г� �Դϴ�.
		
		
	}
}
