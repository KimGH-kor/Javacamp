package ch03;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer("�̼���", 10010);
		
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustmorInfo() + price);
		
		
		//��� ������ Customer�� �ִ� �ɹ� ������ �޼��带 ��� ����
		VIPCustomer customerKim = new VIPCustomer("������", 10020);
		
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustmorInfo() + price);
		
		
		
		Customer vc = new VIPCustomer("noname", 123456);
		System.out.println(vc.calcPrice(1000));	//900
		
	}
}
