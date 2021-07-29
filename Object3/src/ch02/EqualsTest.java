package ch02;

public class EqualsTest {
	public static void main(String[] args) {
		//우리는 번호만 같다면 같게하고 싶다.
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		Student std3 = std1;//주소를 넘겨준다.
		
		
		
		System.out.println(std1 == std2);//false
		System.out.println(std1.equals(std2));//false // 바꾸고 난 후 true
		System.out.println(std1 == std3);//true
		
		System.out.println(std1.hashCode());//1554547125 // 바꾸고 난 후 100
		System.out.println(std2.hashCode());//617901222  // 100
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));//true
		
		System.out.println(str1.hashCode());//96354
		System.out.println(str2.hashCode());//96354
		
		Integer i = 100;
		System.out.println(i.hashCode());//100 그대로 반환해줌 
		// 그렇기 떄문에 해쉬코드를 재정의 할때 인트값을 반환시키면 같은 해쉬값이 된다.
		
		
		
	}
}
