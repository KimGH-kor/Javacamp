package ch01;

public class Customer {
	//���� Ŭ���������� ���� ���� but �ٸ� ��Ű�������� ���� �Ұ�
	protected int customerID;
	public int getCustomerID() {
		return customerID;
	}

	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustmorInfo() {
		return customerName + "���� �����" + customerGrade+ "�̸�, ���ʽ� ����Ʈ�� "+bonusPoint + "�Դϴ�";
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}