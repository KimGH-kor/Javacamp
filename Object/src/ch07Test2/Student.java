package ch07Test2;

public class Student {
	int studentID;
	String name;
	Subject korea;
	Subject math;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
		korea = new Subject();
		math = new Subject();
	}
	
	public void koreaSetSubject(int point, String name) {

		korea.name = name;
		korea.point = point;
		
	}
	public void mathSetSubject(int point, String name) {
		math.name = name;
		math.point = point;
	}
	public void mathGetSubject() {
		System.out.println(math.name);
		System.out.println(math.point);
	}
	public void koreaGetSubject() {
		System.out.println(korea.name);
		System.out.println(korea.point);
	}
	
	public void showTotalScore() {
		System.out.println(studentID+"의 학생의 이름은 "+name+"이고 총점은 "+(math.point+korea.point)+"입니다.");
	}
	
	
}
