package ch03;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customerLee = new Customer("이순신", 10010);
		
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustmorInfo() + price);
		
		
		//상속 받으면 Customer에 있는 맴버 변수나 메서드를 사용 가능
		VIPCustomer customerKim = new VIPCustomer("김유신", 10020);
		
		customerKim.bonusPoint = 10000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustmorInfo() + price);
		
		
		
		Customer vc = new VIPCustomer("noname", 123456);
		System.out.println(vc.calcPrice(1000));	//900
		
	}
}
