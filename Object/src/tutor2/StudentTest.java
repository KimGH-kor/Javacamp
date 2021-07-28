package tutor2;

public class StudentTest {
	public static void main(String[] args) {
		Student Lee = new Student("Lee");
		
		Lee.setSubject("국어", 100);
		Lee.setSubject("수학", 50);
		
		Lee.takePoint();

		Lee.StudentTotal();

		Student.line();
		
		Student Kim = new Student("Kim");
		Kim.setSubject("국어", 70);
		Kim.setSubject("수학", 85);
		Kim.setSubject("영어", 100);
		
		Kim.takePoint();
		
		Kim.StudentTotal();
		
		
	}
}
