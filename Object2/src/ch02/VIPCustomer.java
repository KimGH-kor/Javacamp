package ch02;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	String agentID;
	
	
	public VIPCustomer() {
//		super();//���� �����ڸ� ȣ���� �����ϴµ� �װ� ���еǾ��ִ�.
		bonusRatio = 0.05;
		customerGrade = "VIP";
		salesRatio = 0.1;
		System.out.println("VIPcustomer() call");
	}
	
	public String agtAgentID() {
		return agentID;
	}
}
