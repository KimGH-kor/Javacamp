package ch07Test2;

public class StudentTest {

	public static void main(String[] args) {
		Student Lee = new Student(3452, "Lee");
		
		Lee.koreaSetSubject(100, "국어");
		Lee.mathSetSubject(99, "수학");
		
		Lee.koreaGetSubject();
		System.out.println();
		Lee.mathGetSubject();
		System.out.println();
		Lee.showTotalScore();
	}

}
