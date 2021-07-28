package tutor3;

import java.util.ArrayList;

public class Student {
	private String name;
	ArrayList<Subject> list;
	Subject subject;
	
	public Student(String name) {
		this.name = name;
		list = new ArrayList<Subject>();
	}
	
	public void setSubject(String name, int point) {
		subject = new Subject(name, point);
		list.add(subject);
	}
	
	public void takePoint() {
		for(int i = 0; i < list.size(); i++) {
		System.out.println(name+"���� "+list.get(i).getName()+" ������ "+list.get(i).getPoint()+"�Դϴ�.");
		}
	}
	
	public void StudentTotal() {
		int total =0;
		for(Subject arr : list) {
			total += arr.getPoint();
		}
		
		System.out.println(name+"���� ������ "+total+"�Դϴ�.");
	}
	
	public static void line() {
		System.out.println("===================================");
	}
	
	
}
