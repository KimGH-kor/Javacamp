package tutor2;

public class StudentTest {
	public static void main(String[] args) {
		Student Lee = new Student("Lee");
		
		Lee.setSubject("����", 100);
		Lee.setSubject("����", 50);
		
		Lee.takePoint();

		Lee.StudentTotal();

		Student.line();
		
		Student Kim = new Student("Kim");
		Kim.setSubject("����", 70);
		Kim.setSubject("����", 85);
		Kim.setSubject("����", 100);
		
		Kim.takePoint();
		
		Kim.StudentTotal();
		
		
	}
}
