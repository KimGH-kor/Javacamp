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
		System.out.println("�ֹ� ���� ��ȣ : "+orderId);
		System.out.println("�ֹ� �ڵ��� ��ȣ : "+orderPon);
		System.out.println("�ֹ� �� �ּ� : "+address);
		System.out.println("�ֹ� ��¥ : "+orderDate);
		System.out.println("�ֹ� �ð� : "+orderTime);
		System.out.println("�ֹ� ���� : "+orderPrice);
		System.out.println("�޴� ��ȣ : "+orderNumber);
	}
	
}
