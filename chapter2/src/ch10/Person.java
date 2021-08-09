package ch10;

public class Person {
	String name;
	int age;
	
	public Person() {
//여기서 this는 스트링과 int값을 가진 함수를 불러오는 것
// 결과적으로 밑에 있는 Person을 가리키게 된다.
// 또한 생성자에서 다른 생성자를 호출하는 경우, this의 생성이 완전하지 않은 상태에서는 this위에는
// 아무것도 못쓴다. 아래에 적는 것은 상관없다. 
//		int num = 10; 위에 적어서 오류가 남
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
	
	//여기서의 Person은 데이터타입이다.
	public Person getPerson() {
		return this;//참조변수값을 반환한다.
	}

	public static void main(String[] args) {
		
		Person person = new Person();
		person.showPerson();
		
		//같은 값을 반환
		System.out.println(person);//ch10.Person@7a81197d
		System.out.println(person.getPerson());//ch10.Person@7a81197d
		
	}
	
}
