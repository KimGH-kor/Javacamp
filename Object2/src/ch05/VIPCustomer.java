package ch05;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	String agentID;
	
	
	public VIPCustomer(String customerName, int customerID) {
		super(customerName, customerID);//���� �����ڸ� ȣ���� �����ϴµ� �װ� ���еǾ��ִ�.
		bonusRatio = 0.05;
		customerGrade = "VIP";
		salesRatio = 0.1;
	}
	
	public String agtAgentID() {
		return agentID;
	}
	
	//�������̵� ��
	@Override // �̰� ������̼� (�̸� ��ȯ�� �������� �� ���ƾ���)
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
