package ch07Test3;

public class Student {
	int ID;
	String name;
	Subject math;
	Subject korean;
	
	public Student(int ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	public void mathSetSubject(int point, String name) {
		math = new Subject(point, name);
	}
	public void koreaSetSubject(int point, String name) {
		korean = new Subject(point, name);
	}
	
	public void mathGetSubject() {
		System.out.println(math.name);
		System.out.println(math.point);
	}
	public void koreaGetSubject() {
		System.out.println(korean.name);
		System.out.println(korean.point);
	}
	
	public void showTotalScore() {
		int Total = math.point+korean.point;
		System.out.println(Total);
	}
	
	
	
}
