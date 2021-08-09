package ch01;

public class Order2Test {
	public static void main(String[] args) {
		OrderTest ot = new OrderTest();
		
		ot.buyerId = "kim";
		ot.orderId = 1234;
		ot.orderName= "lim";
		
		ot.showOrder();
	}
}
