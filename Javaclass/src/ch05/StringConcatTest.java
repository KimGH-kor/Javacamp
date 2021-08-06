package ch05;

public class StringConcatTest {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl strImpl = new StringConcatImpl();
		
		strImpl.makeString("Hello", "World");
		
		StringConcat concat = ( s , v )->System.out.println(s1+","+s2);
		concat.makeString(s1, s2);
		
		
		//람다식을 사용한다고 클래스가 안만들어 진 것이 아니라 익명 클래스가 가려져서 생성된다.
//		StringConcat concat2 = new StringConcat() {
//			
//			@Override
//			public void makeString(String s1, String s2) {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
	}
}
