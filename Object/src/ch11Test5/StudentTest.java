package ch11Test5;

public class StudentTest {
	public static void main(String[] args) {
		Bus bus110 = new Bus(1800);
		Subway subway5 = new Subway(5);
		Texi texi3854 = new Texi(3854);
		
		int eight = 8000;
		Student yang = new Student("양지현", eight);
		Student kim = new Student("김경환", 6000);
		
		int a =subway5.showNumber();
		
		
		yang.takeSubway(subway5);
		kim.takeTexi(texi3854);
		
		yang.showStudentInto();
		kim.showStudentInto();
		
		bus110.showBusInfo();
		subway5.showSubwayInfo();
		texi3854.showTexiInfo();
		
	}
}
