package ch03;

public class StudentTest {
	public static void main(String[] args) {
		//Student 하나를 생성해라
		//이렇게 생기는 studentLee를 인스턴스(참조변수)라고 한다.
		Student studentLee = new Student();
		
		studentLee.studentID = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();//12345학번 학생의 이름은 Lee이고, 주소는 서울 강남구입니다.
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "대구 북구";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
