package ch05;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerT = new Customer("Tomas", 10010);
		Customer customerJ = new Customer("James", 10020);
		Customer customerE = new GoldCustomer("Edward", 10030);
		Customer customerP = new GoldCustomer("Percy", 10040);
		Customer customerK = new VIPCustomer("Kim", 10050);
		
		customerList.add(customerT);
		customerList.add(customerJ);
		customerList.add(customerE);
		customerList.add(customerP);
		customerList.add(customerK);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustmorInfo()); 
		}
		
		int price = 10000;
		
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+"님이 "+cost+"원을 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 보너스 포인트는 "+customer.bonusPoint+"입니다.");
		}
		
	}
}
