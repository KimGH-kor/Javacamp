package totor2;

import java.util.ArrayList;

public class Student {
	String name;
	ArrayList<Subject> subject;
	
	public Student(String name) {
		this.name = name;
		subject = new ArrayList<Subject>();
	}
	
	public void setSubject(String name, int point) {
	subject.add(new Subject(name, point));	
	}
	
	public void takePoint() {
		for(int i = 0; i < subject.size(); i++) {
			System.out.println( name+"님의 "+subject.get(i).getName()+"의 점수는 "+subject.get(i).getPoint()+"입니다.");
			
		}	
	}
	
	public void StudentTotal() {
		int total = 0;
		for(int i =0 ; i < subject.size(); i++) {
			total += subject.get(i).getPoint();
		}
		System.out.println(name+"님의 총점은 " +total+"입니다.");
	}

	public static void line() {
		System.out.println("===================================");
	}
}
