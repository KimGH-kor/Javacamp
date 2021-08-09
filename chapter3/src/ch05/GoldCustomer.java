package ch05;

public class GoldCustomer extends Customer {

	double salesRatio;
	
	
	public GoldCustomer(String customerName, int customerID) {
		super(customerName, customerID);
		customerGrade = "GOLD";
		salesRatio = 0.1;
		bonusRatio = 0.02;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price-(int)(price *salesRatio);
	}
	
}
