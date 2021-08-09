package ch03;

public class GkrtodTest {
	public static void main(String[] args) {
		Gkrtod lee = new Gkrtod();
		
		lee.gkrtodID = 1234;
		lee.name = "lee";
		lee.address = "´ë±¸";
		
		lee.showGkrtodInfo();
		String lee2 = lee.getName();
		lee.setName("kim");
		lee.showGkrtodInfo();
	}
}
