package tutor4;

import java.util.ArrayList;

public class Student {
	String name;
	ArrayList<Subject> List;
	Subject subject;
	
	public Student(String name) {
		this.name = name;
		List = new ArrayList<>();
	}
	
	public void setSubject(String name, int point) {
		subject = new Subject(name, point);
		List.add(subject);
	}
	
	public void takePoint() {
		for(Subject su : List) {
			System.out.println("�л� "+name+"�� "+su.name+"���� ������ "+su.point+"�Դϴ�.");
		}
	}
	public void StudentTotal() {
		int total = 0;
		for(Subject su : List) {
			total += su.point;
		}
		System.out.println("�л� "+name+"�� ������ "+total+"�Դϴ�.");
	}
	
	public static void line() {
		System.out.println("================================");
	}
	
}
