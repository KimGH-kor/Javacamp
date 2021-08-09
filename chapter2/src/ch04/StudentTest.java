package ch04;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(); //student클래스에 디폴트 생성자가 없는 경우 이렇게 못쓴다.
											//쓸려면 student클래스에 디폴트 생성자를 생성 해주어야 한다.
		//정보를 주지 않는 다면
//		int i;여기서 i만 출력할려한다면 초기화가 안되어있기 때문에 오류난다.
		System.out.println(studentLee.showStudentInfo());//null학생의 학번은 0이고, 0학년 입니다.
		
		Student studentKim = new Student(12345, "Kim", 3);
		System.out.println(studentKim.showStudentInfo());//Kim학생의 학번은 12345이고, 3학년 입니다.
		
		
	}
}
