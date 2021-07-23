package ch05;

public class Customer {
	//하위 클레스에서는 접근 가능 but 다른 패키지에서는 접근 불가
	protected int customerID;
	public int getCustomerID() {
		return customerID;
	}

	protected String customerName;
	protected String customerGrade;
	int bonusPoint;//보너스 포인트
	double bonusRatio;//할인율
	
	public Customer(String customerName, int customerID) {
		this.customerName = customerName;
		this.customerID = customerID;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustmorInfo() {
		return customerName + "님의 등급은" + customerGrade+ "이며, 보너스 포인트는 "+bonusPoint + "입니다";
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
