package ch04;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
//	public Student() {
//		System.out.println("student �ļ�");
//	}
	
	public Student() {//����Ʈ �����ڴ� ���� ���� �����ڸ� ������ �ʴ´ٸ� �ڵ� �����ȴ�.
		
	}
	
	public Student(int studentNumber, String studentName, int grade) {
//		studentNumber = studentNumber;�̰� ���� ���� ����� ������ ã�� ������
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	
	public String showStudentInfo() {
		
		return studentName + "�л��� �й��� "+ studentNumber+ "�̰�, "+ grade + "�г� �Դϴ�.";
	}
	
}
