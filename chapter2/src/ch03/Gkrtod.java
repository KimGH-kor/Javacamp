package ch03;

public class Gkrtod {
	//�й� �̸� �ּ�
	int gkrtodID;
	String name;
	String address;
	
	public void showGkrtodInfo() {
		System.out.println(gkrtodID+"�� �̸��� "+name+"�ư� �ּҴ� "+address+"�̴�.");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
