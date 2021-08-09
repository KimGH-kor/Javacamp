package ch09;

public class AutoCloseTest {
	public static void main(String[] args) {
		AutoCloseableObj obj = new AutoCloseableObj();
		
		//try뒤에 (~~~)가 있으면 자동으로 close해준다. try하든 catch를 하든
		try(obj){
			throw new Exception();//강제 예외 생성
		}catch(Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");
//		closing...
//		exception
//		end

				
	}
}
