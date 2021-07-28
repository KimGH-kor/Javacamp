package ch12;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		//업캐스팅
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
//		buyer.sell(); 불가
//		buyer.hello(); 불가
		
		
		Sell seller = customer;
		seller.sell();
		seller.order();
//		seller.but(); 불가
//		seller.hello(); 불가		
		
	}
}
