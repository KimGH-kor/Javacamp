package ch05;

public class StringConcatTest {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "World";
		
		StringConcatImpl strImpl = new StringConcatImpl();
		
		strImpl.makeString("Hello", "World");
		
		StringConcat concat = ( s , v )->System.out.println(s1+","+s2);
		concat.makeString(s1, s2);
		
		
		//���ٽ��� ����Ѵٰ� Ŭ������ �ȸ���� �� ���� �ƴ϶� �͸� Ŭ������ �������� �����ȴ�.
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
