package ch11;

public class StudentTest {
	public static void main(String[] args) {
		Student Lee = new Student("Lee" , 3000);
		Student Kim = new Student("Kim", 5000);
		Bus bus910 = new Bus(910);

		Subway subway1000 = new Subway(1000);
		Texi texi3420 = new Texi(3420);
		
		Lee.takeBus(bus910);
		Kim.takeSubway(subway1000);
		Kim.takeTexi(texi3420);
		
		Lee.showInfo();
		Kim.showInfo();
		
		bus910.showBusInfo();
		subway1000.showSubwayInfo();
		texi3420.showTexiInfo();
	}
}
