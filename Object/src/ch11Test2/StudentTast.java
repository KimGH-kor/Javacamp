package ch11Test2;

public class StudentTast {
	public static void main(String[] args) {
		Student Lee = new Student("Lee", 8000);
		
		Bus bus100 = new Bus(100);
		Texi texi3456 = new Texi(3456);
		Subway subway7 = new Subway(7);
		
		
		
		Lee.takeBus(bus100);
		
		
		bus100.showBusInfo();
		texi3456.showInfo();
		subway7.showInfo();
		
		Lee.showStudentInfo();
	}
}
