package ch02;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	String agentID;
	
	
	public VIPCustomer() {
//		super();//상위 생성자를 호출을 먼저하는데 그건 은닉되어있다.
		bonusRatio = 0.05;
		customerGrade = "VIP";
		salesRatio = 0.1;
		System.out.println("VIPcustomer() call");
	}
	
	public String agtAgentID() {
		return agentID;
	}
}
