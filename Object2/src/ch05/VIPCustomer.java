package ch05;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	String agentID;
	
	
	public VIPCustomer(String customerName, int customerID) {
		super(customerName, customerID);//상위 생성자를 호출을 먼저하는데 그건 은닉되어있다.
		bonusRatio = 0.05;
		customerGrade = "VIP";
		salesRatio = 0.1;
	}
	
	public String agtAgentID() {
		return agentID;
	}
	
	//오버라이딩 됨
	@Override // 이건 어노테이션 (이름 반환값 변수명이 다 같아야함)
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
	
	public int tutor(int i) {
		i = 10;
			return i;
	}
	
}
