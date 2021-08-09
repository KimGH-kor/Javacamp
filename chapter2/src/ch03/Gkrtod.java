package ch03;

public class Gkrtod {
	//학번 이름 주소
	int gkrtodID;
	String name;
	String address;
	
	public void showGkrtodInfo() {
		System.out.println(gkrtodID+"의 이름은 "+name+"아고 주소는 "+address+"이다.");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
