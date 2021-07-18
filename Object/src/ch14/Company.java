package ch14;

public class Company {

	//이 객체는 유일해야한다. 
	private static Company instance = new Company();
	
	private Company() {
		
	}
	
	//외부에서 쓸수 있게하는 것
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
