package ch07Test;

public class Student {
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public void koreaSetSubject(int score, String subjectName) {
		korea.score = score;
		korea.subjectName = subjectName;
	}
	public void koreaGetSubject() {
		System.out.println(korea.score);
		System.out.println(korea.subjectName);
	}
	
	public void mathSetSubject(int score, String subjectName) {
		math.score = score;
		math.subjectName = subjectName;
	}
	public void mathGetSubject() {
		System.out.println(math.score);
		System.out.println(math.subjectName);
	}
	
	public void showTotalScore() {
		int total = korea.score + math.score;
		System.out.println(studentId+"의 학생의 이름은 "+studentName+"이고 총점은 "+total+"입니다.");
	}
	
}
