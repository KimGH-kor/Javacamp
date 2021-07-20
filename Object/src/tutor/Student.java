package tutor;

import java.util.ArrayList;

public class Student {
	
	String name;
	int tensu;
	int total;
	ArrayList<Subject> subject;

	public Student(String name) {
		this.name = name;
		subject = new ArrayList<Subject>();
	}
	
	public void setSubject(String name, int tensu) {
		Subject subject = new Subject(name, tensu);
		this.subject.add(subject);
	}
	
	
	public void takePoint () {
		for(int i = 0; i < subject.size(); i++) {
		System.out.println("학생"+ name +"의 "+subject.get(0).showName()+"과목 성적은"+subject.get(0).showTensu()+"입니다.");
		}
	}
	
	public void StudentTotal() {
		for(int i = 0; i < subject.size(); i++) {
		this.total += subject.get(i).showTensu();
		}
		System.out.println("학생" + name+"의 총점은 "+total+"입니다.");
	}
	
	public static void line() {
		System.out.println("=======================================================");
	}
}
