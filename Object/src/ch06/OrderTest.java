package ch06;

public class OrderTest {
	public static void main(String[] args) {
		Order Lee = new Order();
		
		Lee.orderId = 202011020003L;
		Lee.orderPon = 01023450001;
		Lee.address = "서울시 강남구 역삼동 111-333";
		Lee.orderDate = 20201102;
		Lee.orderTime = 130258;
		Lee.orderPrice = 35000;
		Lee.orderNumber = 0003;
		
		Lee.showOrder();
	}
}
