package ch11Test3;

public class StudentTest {
	public static void main(String[] args) {
		Student Lee = new Student("Lee", 5000);
		Bus bus1 = new Bus(500);
		Texi texi1 = new Texi(200);
		
		Lee.takeBus(bus1);
		Lee.takeTexi(texi1);
		
		Lee.showStudentInfo();
		
	}
}
