package ch03;

public class StudentTest {
	public static void main(String[] args) {
		//Student �ϳ��� �����ض�
		//�̷��� ����� studentLee�� �ν��Ͻ�(��������)��� �Ѵ�.
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "���� ������";
		
		studentLee.showStudentInfo();//12345�й� �л��� �̸��� Lee�̰�, �ּҴ� ���� �������Դϴ�.
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "�뱸 �ϱ�";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
