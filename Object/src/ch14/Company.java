package ch14;

public class Company {

	//�� ��ü�� �����ؾ��Ѵ�. 
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	//�ܺο��� ���� �ְ��ϴ� ��
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
