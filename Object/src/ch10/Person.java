package ch10;

public class Person {
	String name;
	int age;
	
	public Person() {
//���⼭ this�� ��Ʈ���� int���� ���� �Լ��� �ҷ����� ��
// ��������� �ؿ� �ִ� Person�� ����Ű�� �ȴ�.
// ���� �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ� ���, this�� ������ �������� ���� ���¿����� this������
// �ƹ��͵� ������. �Ʒ��� ���� ���� �������. 
//		int num = 10; ���� ��� ������ ��
//		name = "kim";
		this("no name", 1);
		
	}
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public void showPerson() {
		System.out.println(name + " "+ age);
	}
	
	//���⼭�� Person�� ������Ÿ���̴�.
	public Person getPerson() {
		return this;//������������ ��ȯ�Ѵ�.
	}

	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
		
		//���� ���� ��ȯ
		System.out.println(person);//ch10.Person@7a81197d
		System.out.println(person.getPerson());//ch10.Person@7a81197d
		
	}
	
}
