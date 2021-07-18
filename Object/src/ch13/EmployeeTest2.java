package ch13;

public class EmployeeTest2 {
	public static void main(String[] args) {

		System.out.println(Employee.getSerialNum());//1000
		Employee.setSerialNum(1003);
		System.out.println(Employee.getSerialNum());//1003
	}

}
