package ch13;

public class IfElseIfElseTest {
	public static void main(String[] args) {
		int age = 12;
		int charge = 0;//글로벌 값으로 저장할 변수 선언
					  //코테 풀때 0이 있을때랑 없어도 될때가 있었는데 이 문제는
		              //저 값을 쓸때 어떠한 경우라도 값이 들어가 있어야 하기 때문이었다.
		              //if문에 else가 없다면 쓸 수 없던 것
		
		//if안에 변수를 선언하고 값을 넣어도 블록안에 있어서 값이 초기화 된다.
		if(age < 8){
			charge = 1000; 
			System.out.println("미 취학 아동입니다.");
		}else if(age < 14){//12세이기때문에 초등학생 입니다.
			charge = 2000;
			System.out.println("초등학생 입니다.");
		}else if(age < 20){
			charge = 2500;
			System.out.println("중, 고등학생 입니다.");
		}else{
			charge = 3000;
			System.out.println("일반인 입니다.");
		} 
		
		System.out.println("입장료는 " + charge + "원입니다.");//입장료는 2000원입니다. 출력

	}
}
