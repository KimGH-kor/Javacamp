package ch07Test2;

public class Student2 extends Student{

	public Student2(int studentID, String name) {
		super(studentID, name);
	}

	@Override
	public void showTotalScore() {
		System.out.println("Student2의 메서드");
	}
	
	
	

}
