package ch12;

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("�̼���");
		
		Employee employeeKim = new Employee();//1000;
		employeeKim.setEmployeeName("������");
		
		System.out.println(Employee.getSerialNum());
		
		System.out.println(employeeLee.getEmployeeName()+"���� ����� "+employeeLee.getEmployeeId()+"�Դϴ�.");//�̼��Ŵ��� ����� 1001�Դϴ�.
		System.out.println(employeeKim.getEmployeeName()+"���� ����� "+employeeKim.getEmployeeId()+"�Դϴ�.");//�����Ŵ��� ����� 1002�Դϴ�.
		//���� �ν��Ͻ��� �����ϴ� � ���� �ʿ��ϸ� ����ƽ�� Ȱ��
		//���� Ȱ���ϴ� ���� ����ƽ ������ Ȱ���ϴ� ��
	}
}
