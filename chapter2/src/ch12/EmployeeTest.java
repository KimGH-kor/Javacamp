package ch12;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");
		
		Employee employeeKim = new Employee();//1000;
		employeeKim.setEmployeeName("김유신");
		
		System.out.println(Employee.getSerialNum());
		
		System.out.println(employeeLee.getEmployeeName()+"님의 사번은 "+employeeLee.getEmployeeId()+"입니다.");//이순신님의 사번은 1001입니다.
		System.out.println(employeeKim.getEmployeeName()+"님의 사번은 "+employeeKim.getEmployeeId()+"입니다.");//김유신님의 사번은 1002입니다.
		//여러 인스턴스가 공유하는 어떤 값이 필요하면 스태틱을 활용
		//지금 활용하는 것은 스태틱 변수만 활용하는 것
	}
}
