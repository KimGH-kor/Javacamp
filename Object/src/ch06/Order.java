package ch06;

public class Order {
	long orderId;
	int orderPon;
	String address;
	int orderDate;
	int orderTime;
	int orderPrice;
	int orderNumber;
	
	public void showOrder() {
		System.out.println("주문 접수 번호 : "+orderId);
		System.out.println("주문 핸드폰 번호 : "+orderPon);
		System.out.println("주문 집 주소 : "+address);
		System.out.println("주문 날짜 : "+orderDate);
		System.out.println("주문 시간 : "+orderTime);
		System.out.println("주문 가격 : "+orderPrice);
		System.out.println("메뉴 번호 : "+orderNumber);
	}
	
}
