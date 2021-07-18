package ch12;

public class Employee {

	private static int serialNum = 1000;//����ƽ

	private int employeeId;
	private String employeeName;
	private String department;
	//��ü�� �����ɶ� �ʱ�ȭ �۾��� �����ڰ� �Ѵ�.
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	
	
	public static int getSerialNum() {		
		return serialNum;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
