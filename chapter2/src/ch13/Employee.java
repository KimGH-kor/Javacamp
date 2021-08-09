package ch13;

public class Employee {
	private int employeeId;
	
	private static int serialNum = 1000;//스태틱
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		int i = 0;//지역변수는 상관없다.
		
//		employeeName = "Lee";  //오류발생
		Employee.serialNum = serialNum;
	}
	
}
