package ch06;

public class People {
	int 키;
	int 몸무게;
	String 이름;
	int 나이;
	String 성별;
	
	public People(int 키, int 몸무게, String 이름, int 나이, String 성별) {
		this.키 = 키;
		this.몸무게 = 몸무게;
		this.이름 = 이름;
		this.나이 = 나이;
		this.성별 = 성별;
	}
	public void showPeople() {
		System.out.println("키가 "+키+"이고 몸무게가 "+몸무게+"킬로인 "+ 성별 +"이 있습니다. 이름은 "+이름+"이고 나이는 "+나이+"세 입니다.");
	}
}
