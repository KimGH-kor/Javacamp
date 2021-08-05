package ch01;

//외부 클래스
class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	
	//내부 클래스
	class InClass{
		int iNum = 100;
		
		
		void inTest() {
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
		}
	}
	public void usingClass() {
		inClass.inTest();
	}
	//정적 내부 클래스
	static class InStaticClass{
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("InClass num = " +iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
//			System.out.println("InClass num = " +iNum + "(내부 클래스의 인스턴스 변수)"); 사용불가
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
	}
}

public class InnerTest {
	public static void main(String[] args) {
		
//		OutClass outClass = new OutClass();
//		//외부 클래스에서 내부 클래스의 메서드를 쓴다.
//		outClass.usingClass();
//		
//		//외부 클래스에서 내부클래스의 인스턴스를 만드는 방법(private가 아닌경우 외부에서 부르는 방법)
//		OutClass.InClass inner = outClass.new InClass();
//		inner.inTest();
		
		//정적 클래스의 메서드
		OutClass.InStaticClass sInClass =new OutClass.InStaticClass();
		sInClass.inTest();
		
		System.out.println();
		//정적 클래스의 정적 메서드 
		OutClass.InStaticClass.sTest();
		
		
	}
}
