package ch09;

public class AutoCloseTest {
	public static void main(String[] args) {
		AutoCloseableObj obj = new AutoCloseableObj();
		
		//try�ڿ� (~~~)�� ������ �ڵ����� close���ش�. try�ϵ� catch�� �ϵ�
		try(obj){
			throw new Exception();//���� ���� ����
		}catch(Exception e) {
			System.out.println("exception");
		}
		
		System.out.println("end");
//		closing...
//		exception
//		end

				
	}
}
