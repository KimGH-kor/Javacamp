package ch04;

public class Student {
	
	public int studentNumber;
	public String studentName;
	public int grade;
	
//	public Student() {
//		System.out.println("student 셍성");
//	}
	
	public Student() {//디폴트 생성자는 내가 따로 생성자를 만들지 않는다면 자동 생성된다.
		
	}
	
	public Student(int studentNumber, String studentName, int grade) {
//		studentNumber = studentNumber;이건 오류 가장 가까운 변수를 찾기 떄문에
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.grade = grade;
	}
	
	
	public String showStudentInfo() {
		
		return studentName + "학생의 학번은 "+ studentNumber+ "이고, "+ grade + "학년 입니다.";
	}
	
}
