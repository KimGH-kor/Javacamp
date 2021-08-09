package ch01;

public class OrderTest {
	int orderId;
	String orderName;
	String buyerId;
	String sellerId;
	int productId;
	String orderDate;
	
	public void showOrder() {
		System.out.println(orderId+"의 이름은 "+orderName+"이고 "+"신청을 받은 분은 "+buyerId+"입니다.");
	}
}
