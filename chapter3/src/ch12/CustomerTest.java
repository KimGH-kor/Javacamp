package ch12;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		//��ĳ����
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
//		buyer.sell(); �Ұ�
//		buyer.hello(); �Ұ�
		
		
		Sell seller = customer;
		seller.sell();
		seller.order();
//		seller.but(); �Ұ�
//		seller.hello(); �Ұ�		
		
	}
}
